
import java.time.LocalDate;

public class Warehouse {

    private MinHeap minHeap = new MinHeap();

    public void addBatch(FoodBatch batch) {

        if (batch.getQuantity() <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        if (batch.getExpiryDate().isBefore(LocalDate.now())) {
            System.out.println("Cannot add an expired food batch.");
            return;
        }

        minHeap.insert(batch);

        System.out.println("Food batch added successfully!");
    }

    public void dispatchFood() {

        while (!minHeap.isEmpty()) {

            FoodBatch batch = minHeap.extractMin();

            if (batch.getExpiryDate().isBefore(LocalDate.now())) {
                System.out.println("Expired batch skipped: " + batch);
                continue;
            }

            System.out.println("\nFood Dispatched Successfully!");
            System.out.println(batch);

            return;
        }

        System.out.println("No valid food batches available.");
    }

    public void displayBatches() {

        System.out.println("\n--- Warehouse Food Batches ---");

        minHeap.display();
    }
}
