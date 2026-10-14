import java.util.Scanner;

public class IT24104085Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            // bill amount
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();
            scanner.nextLine(); 

            // Enter the payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.nextLine().trim().toUpperCase().charAt(0);

            // payment and calculate discount
            if (paymentMode == 'C') {
                double discount = totalBill * 0.05;
                double amountToPay = totalBill - discount;
                System.out.printf("Discount is: %.2f\n", discount);
                System.out.printf("Amount to be paid: %.2f\n", amountToPay);

            } else if (paymentMode == 'O') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        scanner.close();
    }
}
