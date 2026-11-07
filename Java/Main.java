
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println(" PERISHABLE FOOD WAREHOUSE DISPATCH");
            System.out.println("========================================");

            System.out.println("1. Add Food Batch");
            System.out.println("2. Dispatch Food");
            System.out.println("3. Display Food Batches");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Batch ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Food Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
                    String date = sc.next();

                    try {
                        FoodBatch batch = new FoodBatch(
                            id,
                            name,
                            quantity,
                            LocalDate.parse(date)
                        );

                        warehouse.addBatch(batch);

                    } catch (Exception e) {
                        System.out.println("Invalid date format.");
                    }

                    break;

                case 2:
                    warehouse.dispatchFood();
                    break;

                case 3:
                    warehouse.displayBatches();
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
