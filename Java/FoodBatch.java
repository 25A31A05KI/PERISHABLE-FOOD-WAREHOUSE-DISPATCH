
import java.time.LocalDate;

public class FoodBatch {

    private int batchId;
    private String foodName;
    private int quantity;
    private LocalDate expiryDate;

    public FoodBatch(int batchId, String foodName,
                     int quantity, LocalDate expiryDate) {

        this.batchId = batchId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public int getBatchId() {
        return batchId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Batch ID: " + batchId +
               " | Food: " + foodName +
               " | Quantity: " + quantity +
               " | Expiry Date: " + expiryDate;
    }
}
