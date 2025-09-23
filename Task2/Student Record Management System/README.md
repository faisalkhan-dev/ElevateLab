# 🧾 Student Record Management System

## 📘 Overview

This project is a **console-based student record management system** developed in Java. It offers a simple, interactive, menu-driven interface to **add, view, update, and delete student records**, each consisting of an ID, name, and marks.

The system uses **Java's `ArrayList`** to dynamically store and manage `Student` objects. The implementation emphasizes object-oriented design, modular methods, and input validation, making it an excellent project for beginners to understand Java collections, classes, and control flow.

---

## ✨ Features

### 🔹 Core Functionalities

- **Add Student**: Adds a new student by entering ID, name, and marks. Prevents duplicate IDs.
- **View Students**: Displays the details of all students in the list.
- **Update Student**: Edits the name and marks of a student using their ID.
- **Delete Student**: Removes a student record based on the provided ID.

### 🛡️ Input Handling and Safety

- Checks for duplicate student IDs before adding new records.
- Validates whether the student exists before performing update/delete operations.
- Uses a global `Scanner` object for consistent input handling.



