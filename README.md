# 🚀 ProjectFlow Pro

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge)
![HTML](https://img.shields.io/badge/HTML5-Frontend-E34F26?style=for-the-badge)
![CSS](https://img.shields.io/badge/CSS3-Styled-1572B6?style=for-the-badge)
![JavaScript](https://img.shields.io/badge/JavaScript-Interactive-F7DF1E?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

### Modern Project Management System built with Pure Java HTTP Server

*A lightweight, database-free enterprise project management application featuring Kanban boards, role-based access, analytics, task tracking, and an integrated AI assistant.*

</div>

---

# 📖 Overview

ProjectFlow Pro is a full-stack project management system developed using **Java HttpServer**, **HTML**, **CSS**, and **JavaScript** without relying on external frameworks or databases.

The application demonstrates enterprise software engineering concepts while remaining lightweight and easy to deploy.

---

# ✨ Key Features

## 👤 User Management
- Secure Login
- Session Management
- Role-Based Access Control
- Admin
- Manager
- User

---

## 📁 Project Management

- Create Projects
- Edit Projects
- Project Dashboard
- Project Analytics
- Color Tags
- Team Assignment

---

## ✅ Task Management

- Create Tasks
- Assign Tasks
- Due Dates
- Priority Levels
- Task Comments
- Status Updates

Task States

```
TODO
↓

IN_PROGRESS
↓

REVIEW
↓

DONE
```

---

## 📊 Dashboard

Real-time dashboard displaying

- Total Projects
- Active Tasks
- Completed Tasks
- Progress Statistics
- Activity Feed

---

## 📋 Kanban Board

Interactive Kanban Board

```
TODO
│
├── Task A
├── Task B

↓

IN PROGRESS

↓

REVIEW

↓

DONE
```

Features

- Drag & Drop
- Status Updates
- Priority Colors
- Assignee Display
- Deadline Tracking

---

## 🤖 AI Assistant

Built-in chatbot

Capabilities

- Project Statistics
- Task Summary
- Team Information
- Help Commands
- Friendly Responses

---

## 👥 Team Management

- User Directory
- User Roles
- Avatar Support
- Team Overview

---

## ⚙️ Settings

- User Profile
- Theme Switching
- Password Update
- Avatar Display

---

# 🏗️ System Architecture

```
                Client Browser
                       │
         HTML • CSS • JavaScript
                       │
                 HTTP Requests
                       │
      ┌──────────────────────────┐
      │     Java HTTP Server     │
      │                          │
      │  ApiHandler              │
      │  StaticHandler           │
      │  System Controller       │
      └──────────────────────────┘
                       │
          Read / Write Operations
                       │
      ┌──────────────────────────┐
      │      In-Memory Storage   │
      │                          │
      │ Users                    │
      │ Projects                 │
      │ Tasks                    │
      │ Sessions                 │
      └──────────────────────────┘
```

---

# 📂 Project Structure

```
ProjectFlowPro

│
├── UserView.java
│
├── Models
│   ├── User
│   ├── Project
│   ├── Task
│   └── ActivityLog
│
├── Handlers
│   ├── ApiHandler
│   └── StaticHandler
│
├── Frontend
│   ├── HTML
│   ├── CSS
│   └── JavaScript
│
└── In-Memory Database
```

---

# 🎨 Application Flow

```
Login
   │
   ▼
Dashboard
   │
   ├─────────────┐
   ▼             ▼
Projects      My Tasks
   │             │
   ▼             ▼
Kanban Board  Update Status
   │
   ▼
Analytics
```

---

# 🔄 Task Workflow

```
Task Created
      │
      ▼
TODO
      │
      ▼
IN PROGRESS
      │
      ▼
REVIEW
      │
      ▼
DONE
```

---

# 🔐 User Roles

### 👑 Admin

- Full Access
- Manage Users
- Create Projects
- Manage Tasks
- Analytics

---

### 👨‍💼 Manager

- Create Projects
- Assign Tasks
- Manage Team
- Track Progress

---

### 👨‍💻 User

- View Assigned Tasks
- Update Task Status
- Add Comments
- View Dashboard

---

# 📈 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Backend |
| HttpServer | REST API |
| HTML5 | User Interface |
| CSS3 | Styling |
| JavaScript | Client Logic |
| Chart.js | Analytics |
| Font Awesome | Icons |

---

# 📊 UML Diagrams

This project includes professional UML documentation.

- ✅ Use Case Diagram
- ✅ Class Diagram
- ✅ State Transition Diagram
- ✅ Deployment Diagram
- ✅ Package Diagram

---

# 🎯 Highlights

- Pure Java Implementation
- No External Database
- RESTful API
- Responsive UI
- Glassmorphism Design
- Drag & Drop Kanban
- Dark Mode
- AI Assistant
- Role-Based Security
- Activity Logging

---

# 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/yourusername/ProjectFlowPro.git
```

### Compile

```bash
javac UserView.java
```

### Run

```bash
java UserView
```

### Open

```
http://localhost:8000
```

---

# 📷 Screenshots

```
📷 Login Screen

📷 Dashboard

📷 Projects

📷 Kanban Board

📷 AI Assistant

📷 Team Management

📷 Settings
```

---

# 🔮 Future Improvements

- MySQL Integration
- JWT Authentication
- Email Notifications
- File Uploads
- Calendar Integration
- Gantt Charts
- Mobile Application
- Docker Deployment
- Cloud Database
- AI Task Recommendations

---

# 👨‍💻 Developer

**ProjectFlow Pro**

Developed as a Software Engineering Project demonstrating modern software architecture, UI design, UML modeling, and project management concepts.

---

<div align="center">

### ⭐ If you found this project useful, consider giving it a star!

**ProjectFlow Pro — Manage Projects. Track Progress. Deliver Success.**

</div>
