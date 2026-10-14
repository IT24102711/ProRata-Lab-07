import java.util.Scanner;

public class IT24102711Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter total bill amount for customer " + i + ": ");
            double totalBill = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * 0.05;
                double amountToPay = totalBill - discount;
                System.out.printf("Discount applied: $%.2f\n", discount);
                System.out.printf("Amount to be paid: $%.2f\n", amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.printf("No discount applied. Amount to be paid: $%.2f\n", totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
                i--; // Decrement i to repeat input for the same customer
            }
        }

        scanner.close();
    }
}
