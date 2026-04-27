// UPDATED SystemManagement with JSON persistence (no SQL needed)

import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class SystemManagement {

    static Map<String, String> tasks = new ConcurrentHashMap<>();
    static final String FILE = "tasks.txt";

    public static void main(String[] args) throws Exception {
        loadData();

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange -> {
            String response = "<h1>Task Server Running</h1><p>Use /add?task=xyz or /list</p>";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.createContext("/add", exchange -> {
            String query = exchange.getRequestURI().getQuery();
            String task = query != null && query.contains("=") ? query.split("=")[1] : "empty";
            String id = UUID.randomUUID().toString().substring(0, 5);
            tasks.put(id, task);
            saveData();

            String response = "Added task: " + task;
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.createContext("/list", exchange -> {
            StringBuilder response = new StringBuilder("<h2>Tasks</h2>");
            tasks.forEach((k, v) -> response.append("<p>").append(k).append(": ").append(v).append("</p>"));

            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.toString().getBytes());
            exchange.close();
        });

        server.start();
        System.out.println("Server running at http://localhost:8000");
    }

    static void saveData() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
        for (Map.Entry<String, String> e : tasks.entrySet()) {
            bw.write(e.getKey() + "," + e.getValue());
            bw.newLine();
        }
        bw.close();
    }

    static void loadData() throws IOException {
        File file = new File(FILE);
        if (!file.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",", 2);
            tasks.put(parts[0], parts[1]);
        }
        br.close();
    }
}
