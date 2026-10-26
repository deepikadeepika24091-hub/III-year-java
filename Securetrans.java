import java.util.Scanner;

public class Securetrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance, amount, dailyLimit;
        boolean accountActive;

        System.out.print("Enter account balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter transfer amount: ");
        amount = sc.nextDouble();

        System.out.print("Enter daily transfer limit: ");
        dailyLimit = sc.nextDouble();

        System.out.print("Is the account active? (true/false): ");
        accountActive = sc.nextBoolean();

        // Validate transaction using short-circuit AND
        if (amount > 0 && amount <= balance
                && amount <= dailyLimit && accountActive) {

            balance -= amount;

            System.out.println("Transaction Status: SUCCESS");
            System.out.println("Remaining Balance: ₹" + balance);

        } else {
            System.out.println("Transaction Status: FAILED");
            System.out.println("Remaining Balance: ₹" + balance);
        }

        sc.close();
    }
}