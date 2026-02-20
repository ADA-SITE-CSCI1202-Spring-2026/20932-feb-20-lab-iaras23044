import java.util.Scanner;

public class Exercise03Array15 {

    // Inner Invoice class
    static class Invoice {
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double pricePerItem;

        public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = (quantity > 0) ? quantity : 0;
            this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
        }

        public double getInvoiceAmount() {
            return quantity * pricePerItem;
        }

        public String getPartNumber() { return partNumber; }
        public String getPartDescription() { return partDescription; }
        public int getQuantity() { return quantity; }
        public double getPricePerItem() { return pricePerItem; }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of invoices: ");
        int n = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = input.nextLine();

            System.out.print("Part Description: ");
            String partDescription = input.nextLine();

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            System.out.print("Price per item: ");
            double price = input.nextDouble();
            input.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\n===== Invoice Details =====");

        double total = 0;

        for (Invoice inv : invoices) {
            double amount = inv.getInvoiceAmount();
            total += amount;

            System.out.println("Part Number: " + inv.getPartNumber());
            System.out.println("Description: " + inv.getPartDescription());
            System.out.println("Quantity: " + inv.getQuantity());
            System.out.println("Price per item: " + inv.getPricePerItem());
            System.out.println("Invoice Amount: " + amount);
            System.out.println("----------------------------");
        }

        System.out.println("Total Amount of All Invoices: " + total);

        input.close();
    }
}