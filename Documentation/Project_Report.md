
# PERISHABLE FOOD WAREHOUSE DISPATCH SYSTEM

## Java-Based Data Structures and Algorithms Project Using Min-Heap

### 1. INTRODUCTION

The Perishable Food Warehouse Dispatch System is a Java-based application developed to manage perishable food batches in a warehouse.

Food products such as milk, bread, fruits and vegetables have limited shelf lives. These products must be dispatched before their expiry dates to reduce food wastage.

This project uses a Min-Heap data structure to prioritize food batches according to their expiry dates.

### 2. PROBLEM STATEMENT

Managing multiple food batches manually can be difficult and time-consuming.

The warehouse needs an efficient system to identify food batches that are approaching their expiry dates and dispatch them in the correct order.

### 3. OBJECTIVES

- To develop a Java-based warehouse dispatch system.
- To implement a custom Min-Heap data structure.
- To store food batch details.
- To prioritize food according to expiry dates.
- To dispatch the earliest-expiring eligible batch first.
- To prevent expired food from being dispatched.

### 4. EXISTING SYSTEM

Traditional warehouse management may involve manually checking food expiry dates.

Disadvantages include:
- Time-consuming manual checking.
- Difficulty managing multiple batches.
- Possibility of human errors.
- Inefficient dispatch prioritization.

### 5. PROPOSED SYSTEM

The proposed system uses Java and a custom Min-Heap.

Each food batch contains:
- Batch ID
- Food name
- Quantity
- Expiry date

The Min-Heap ensures that the batch with the earliest expiry date is selected first.

### 6. SOFTWARE REQUIREMENTS

- Programming Language: Java
- JDK: Java Development Kit
- IDE: GitHub Codespaces
- Platform: Windows, Linux or macOS

### 7. HARDWARE REQUIREMENTS

- Computer or laptop
- Minimum 4 GB RAM recommended
- Keyboard and monitor

### 8. SYSTEM MODULES

**FoodBatch.java:** Stores food batch information.

**MinHeap.java:** Implements heap insertion, extraction and heap adjustment.

**Warehouse.java:** Manages food batches and dispatch operations.

**Main.java:** Provides the menu-driven user interface.

### 9. DATA STRUCTURE USED

A Min-Heap is a complete binary tree in which the parent has a priority value less than or equal to its children.

In this project, food expiry dates determine the priority.

The earliest expiry date is stored at the root of the heap.

### 10. ALGORITHM

**Insertion:**
1. Receive a food batch.
2. Validate its quantity and expiry date.
3. Insert it at the end of the heap.
4. Compare it with its parent.
5. Swap while the parent has a later expiry date.
6. Stop when the heap property is satisfied.

**Dispatch:**
1. Check whether the heap is empty.
2. Extract the root batch.
3. Check whether it is expired.
4. Skip expired batches.
5. Dispatch the first eligible batch.

### 11. TIME COMPLEXITY

| Operation | Complexity |
|---|---|
| Insert | O(log n) |
| Extract Minimum | O(log n) |
| Check Empty | O(1) |
| Display | O(n) |

### 12. ADVANTAGES

- Efficient dispatch prioritization.
- Reduces manual expiry-date checking.
- Uses an efficient data structure.
- Simple menu-driven interface.
- Easy to maintain and extend.

### 13. LIMITATIONS

- Data is stored temporarily in memory.
- No database connectivity.
- No graphical user interface.
- No dispatch history.

### 14. FUTURE ENHANCEMENTS

- Database integration.
- Graphical user interface.
- Automatic expiry notifications.
- Dispatch history.
- Partial quantity dispatch.
- Inventory reporting.

### 15. CONCLUSION

The Perishable Food Warehouse Dispatch System demonstrates the practical application of Min-Heap data structures in warehouse management.

It prioritizes food batches based on expiry dates and helps ensure that earlier-expiring eligible food is dispatched first.

This project provides practical knowledge of Java programming, object-oriented programming and data structures and algorithms.

