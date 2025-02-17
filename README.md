# Expense Tracker & Binary Converter

## Overview
This Java application is a combination of an **Expense Tracker** and a **Binary to Decimal Converter** with a GUI built using **Java Swing**. The application allows users to:

- **Manage expenses** by adding, viewing, and categorizing them.
- **Convert binary numbers** to decimal format.

---

## Features
### **Expense Tracker**
- Add expenses with **category, amount, and description**.
- View all expenses in a list.
- Future updates: Edit & Delete functionality, Data persistence.

### **Binary to Decimal Converter**
- Input a **binary number** as a string.
- Convert it to its **decimal equivalent**.
- Display the result in a GUI.

---

## **Flowcharts**
### **Expense Tracker Flowchart**
```plaintext
        Start
          |
     User Inputs Expense
          |
     Store in List
          |
  Display in Expense List
          |
        End
```

### **Binary Converter Flowchart**
```plaintext
        Start
          |
      User Inputs Binary
          |
  Validate Input (0s & 1s)
     /          \
  Valid         Invalid
    |              |
 Convert to     Show Error
 Decimal
    |
  Display Result
    |
    End
```

---

## **Installation & Setup**
### **Step 1: Install IntelliJ IDEA & JDK**
- Install **IntelliJ IDEA** from [JetBrains](https://www.jetbrains.com/idea/download/).
- Install **Java JDK (17+ recommended)**.

### **Step 2: Clone or Create Project**
- Open IntelliJ IDEA.
- Click on **New Project** → Select **Java**.
- Set up your **JDK**.

### **Step 3: Add Source Code**
- Copy & Paste the Java code into the `ExpenseTracker.java` file.
- Ensure you have `javax.swing` imported.

### **Step 4: Run the Application**
- Click **Run → Run 'ExpenseTracker'**.
- The GUI should launch with **expense management** & **binary conversion**.

---

## **Usage**
1. **Expense Tracker**
   - Enter **Category**, **Amount**, and **Description**.
   - Click **Add Expense** → Expense appears in the list.
2. **Binary to Decimal Converter**
   - Enter a **Binary Number**.
   - Click **Convert** → Decimal result is displayed.

---

## **Example Test Cases**
### **Binary Converter**
| Binary Input | Expected Decimal Output |
|-------------|----------------------|
| `101`       | `5`                  |
| `1101`      | `13`                 |
| `10010`     | `18`                 |
| `11111111`  | `255`                |
| `101010`    | `42`                 |

### **Expense Tracker**
| Category   | Amount | Description |
|------------|--------|-------------|
| Food       | 500    | Lunch       |
| Travel     | 150    | Bus Ticket  |
| Shopping   | 1200   | Clothes     |

---

## **Future Improvements**
- Implement **Edit/Delete expenses**.
- Store expenses in a **database (SQLite)**.
- Export **expense reports (CSV/PDF)**.
- Improve UI with **JavaFX**.

---

## **Contributors**
Developed by **[Your Name]**

---

## **License**
This project is open-source and licensed under the MIT License.

