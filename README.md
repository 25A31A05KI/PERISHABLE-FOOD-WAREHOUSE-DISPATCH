
# Perishable Food Warehouse Dispatch System

### Java-Based Data Structures and Algorithms Project Using Min-Heap

## About the Project

The Perishable Food Warehouse Dispatch System is a Java application designed to manage perishable food batches and prioritize their dispatch based on expiry dates.

The system uses a custom Min-Heap data structure to ensure that food batches with earlier expiry dates receive higher dispatch priority.

## Objectives

- Manage perishable food batches.
- Prioritize food according to expiry dates.
- Dispatch earliest-expiring eligible food first.
- Reduce food wastage.
- Demonstrate the application of Min-Heap data structures.

## Technologies Used

- Java
- Object-Oriented Programming
- Min-Heap
- ArrayList
- GitHub Codespaces

## Features

1. Add Food Batch
2. Dispatch Food
3. Display Food Batches
4. Expiry Date Validation
5. Earliest Expiry Priority

## Project Structure

```text
PERISHABLE-FOOD-WAREHOUSE-DISPATCH/
│
├── Java/
│   ├── Main.java
│   ├── FoodBatch.java
│   ├── MinHeap.java
│   └── Warehouse.java
│
├── Documentation/
│   ├── Project_Report.md
│   ├── Abstract.md
│   ├── Algorithm.md
│   └── Test_Cases.md
│
├── Output/
│   ├── menu_screenshot.png
│   ├── dispatch_screenshot.png
│   └── inventory_screenshot.png
│
├── README.md
└── .gitignore
```

## Algorithm Used

The project uses a Min-Heap to organize food batches according to expiry dates.

- Insertion: O(log n)
- Extract Minimum: O(log n)
- Display: O(n)

## How to Run

Open the terminal and execute:

```bash
cd Java
javac Main.java FoodBatch.java MinHeap.java Warehouse.java
java Main
```

## Documentation

Detailed project documentation is available in the Documentation folder.

## Output

Screenshots of program execution are available in the Output folder.

## Future Enhancements

- Database integration
- Graphical user interface
- Inventory reports
- Dispatch history
- Automatic expiry notifications

## Conclusion

This project demonstrates how Min-Heap data structures can be used to improve food warehouse dispatch management by prioritizing batches according to expiry dates.

## Author

GitHub: [25A31A05KI](https://github.com/25A31A05KI)
