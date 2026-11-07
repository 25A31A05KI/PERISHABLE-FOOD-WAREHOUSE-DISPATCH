
# ALGORITHM AND WORKING PRINCIPLE

## 1. Min-Heap Overview

A Min-Heap is a complete binary tree in which the parent node has a priority value less than or equal to its child nodes.

In this project, the expiry date of each food batch is used as the priority.

The batch with the earliest expiry date is placed at the root of the Min-Heap.

## 2. Food Batch Insertion Algorithm

1. Start.
2. Read batch ID, food name, quantity and expiry date.
3. Check whether quantity is positive.
4. Check whether expiry date is valid and not in the past.
5. Insert the batch at the end of the Min-Heap.
6. Compare the inserted batch with its parent.
7. If the inserted batch has an earlier expiry date, swap it with its parent.
8. Repeat until the Min-Heap property is satisfied.
9. Display successful insertion message.
10. Stop.

## 3. Food Dispatch Algorithm

1. Start.
2. Check whether the Min-Heap is empty.
3. If empty, display no valid food batches available.
4. Otherwise, extract the root element.
5. Check whether the batch is expired.
6. If expired, skip the batch and repeat.
7. If valid, display the food batch as dispatched.
8. Stop.

## 4. Heap Operations

### Insertion

Time Complexity: O(log n)

### Extract Minimum

Time Complexity: O(log n)

### Display All Batches

Time Complexity: O(n)

### Check Empty

Time Complexity: O(1)

## 5. Working Principle

The system uses expiry dates to determine dispatch priority.

For example:

| Batch | Food | Expiry Date |
|---|---|---|
| 101 | Milk | 2026-11-10 |
| 102 | Bread | 2026-11-09 |
| 103 | Fruits | 2026-11-12 |

The dispatch order is:

1. Bread
2. Milk
3. Fruits

The earliest-expiring eligible batch is dispatched first.

