package operators.greaterthan;
//Trigger an alert if CPU usage exceeds 80%

import java.util.Scanner;

// Detect if a withdrawal amount exceeds the current balance in a bank account.
public class BalanceValidation {
    public static void main(String[] args) {
        // Current balance in the account
        int balance = 1000;

        // Create Scanner to get user input
        Scanner s = new Scanner(System.in);

        // Ask user to input withdrawal amount
        System.out.println("Current Balance: $" + balance);
        System.out.print("Enter Withdrawal Amount: ");
        int withdrawalAmount = s.nextInt();

        // Check if withdrawal amount exceeds balance
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient balance! Withdrawal amount exceeds current balance.");
        } else if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }

        // Close the scanner
        s.close();
    }
}
