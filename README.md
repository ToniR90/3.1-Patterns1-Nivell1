# 3.1: Patterns – Singleton

## 📚 Overview

This project is part of a broader exercise focused on identifying and implementing software using classic **design patterns**. Applying patterns is essential for building **extensible** and **reusable** software systems.

In this exercise implement the **Singleton** design pattern through a simple command-line application that simulates the functionality of the `Undo` command.

---

## 🎯 Objective

Create a Java application with:

- A class `Undo` that:
  - Stores a history of commands entered by the user.
  - Allows **adding** new commands.
  - Allows **removing** the most recent command (simulating an undo).
  - Allows **listing** all previously entered commands.
- A `Main` class that interacts with the user via the console to demonstrate how the `Undo` system works.
- The `Undo` class must implement the **Singleton** pattern, ensuring that only one instance is used throughout the program.

---

## 🛠️ Technologies

- Java 17+
- Console input/output
- Stack data structure

---

## 🧱 Design Pattern: Singleton

The Singleton pattern ensures that a class has only one instance and provides a global access point to it. In this project, the `Undo` class is implemented as a Singleton to make sure command history is consistent and shared throughout the application.

---

## 🚀 How to Run
Copy the repository: https://github.com/ToniR90/3.1-Patterns1-Nivell1.git
 
