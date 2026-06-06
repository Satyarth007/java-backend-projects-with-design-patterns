# 🚀 Java Backend Projects with Design Patterns

Welcome to the **Design Patterns Revision Repository**! This project serves as a hands-on guide to implementing, practicing, and mastering various software design patterns in Java. 

Instead of looking at isolated code snippets, this repository focuses on real-world use cases (like railway reservation systems) and core framework mechanics (like building a mini-Spring IoC container) to make these concepts stick.

---

## 📚 Project Breakdown & Patterns Covered

### 1. IRCTC (Railway Reservation System) 🚄
* **Core Pattern:** `Command Pattern`
* **Why use it here?** In a high-throughput system like IRCTC, actions like *Book Ticket*, *Cancel Ticket*, and *Check PNR Status* need to be decoupled from the user interface. The Command Pattern encapsulates these requests as objects, allowing you to queue requests, log transactions, and support undo/redo operations seamlessly.

### 2. Custom Spring-like IoC Container 🧪
This project is a deep dive into how modern frameworks handle object lifecycles and dependencies under the hood.

* **Inversion of Control (IoC):** Shifting the responsibility of object creation and management from the application code to a dedicated container.
* **Dependency Injection (DI) Pattern:** The practice of passing required dependencies into an object rather than letting the object create them itself.
* **Autowiring Flavors Implemented:**
    * **By Name:** Injecting dependencies by matching the property name with the bean ID.
    * **By Type:** Injecting dependencies by matching the class type (throws an exception if multiple beans of the same type exist).
    * **By Constructor:** Injecting dependencies directly through the class constructor (the cleanest approach for immutability).

---

## 🛠️ Tech Stack & Prerequisites

* **Language:** Java 17 or higher
* **Build Tool:** Maven / Gradle
* **Concepts:** Reflection API (highly used in the IoC container project), OOP Principles.

---

## 🚀 Getting Started

### Prerequisites
Ensure you have Java JDK and Maven installed on your system.

### Installation
1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/java-backend-projects-with-design-patterns.git](https://github.com/your-username/java-backend-projects-with-design-patterns.git)
