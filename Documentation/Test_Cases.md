
# TEST CASES AND RESULTS

## 1. Introduction

Testing is performed to verify that the Perishable Food Warehouse Dispatch System works correctly.

## 2. Test Cases

| Test ID | Test Scenario | Expected Result |
|---|---|---|
| TC01 | Add valid food batch | Batch added successfully |
| TC02 | Add another valid batch | Batch added successfully |
| TC03 | Enter zero quantity | Invalid quantity rejected |
| TC04 | Enter negative quantity | Invalid quantity rejected |
| TC05 | Add expired food batch | Expired batch rejected |
| TC06 | Display food batches | Available batches displayed |
| TC07 | Dispatch food | Earliest-expiring eligible batch dispatched |
| TC08 | Dispatch from empty warehouse | No valid batches available |
| TC09 | Enter invalid menu option | Invalid choice message displayed |

## 3. Sample Test Data

| Batch ID | Food Name | Quantity | Expiry Date |
|---|---|---|---|
| 101 | Milk | 50 | 2026-11-10 |
| 102 | Bread | 30 | 2026-11-09 |
| 103 | Fruits | 40 | 2026-11-12 |

## 4. Expected Dispatch Order

1. Bread
2. Milk
3. Fruits

This order is based on the earliest expiry date.

## 5. Testing Conclusion

The test cases are designed to verify food batch insertion, expiry-date validation, inventory display and dispatch prioritization.

Actual test results should be recorded after executing each test case in the Java application.
