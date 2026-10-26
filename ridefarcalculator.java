import java.util.Scanner;
public class ridefarcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance, fare = 50, discount;
        int waitingTime;
        boolean premiumMember;
        System.out.print("Enter distance in kilometres: ");
        distance = sc.nextDouble();
        System.out.print("Enter waiting time in minutes: ");
        waitingTime = sc.nextInt();
        System.out.print("Are you a premium member? (true/false): ");
        premiumMember = sc.nextBoolean();
        if (distance <= 0 || waitingTime < 0) {
            System.out.println("Invalid distance or waiting time.");
        } else {
            fare += distance * 12;

            if (waitingTime > 5) {
                fare += (waitingTime - 5) * 2;
            }
            discount = (premiumMember && fare > 300)
                       ? fare * 0.10 : 0;

            fare -= discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Total ride fare: ₹" + fare);
        }

        sc.close();
    }
}