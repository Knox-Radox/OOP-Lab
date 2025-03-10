import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; 
        int choice;

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance: ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ₹");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Successfully deposited ₹" + deposit);
                } else {
                    System.out.println("Invalid deposit amount!");
                }
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ₹");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Successfully withdrew ₹" + withdraw);
                } else {
                    System.out.println("Invalid withdrawal amount or insufficient balance!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break; 
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
