import java.util.Scanner;

public class SmartExamRegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double attendance;
        boolean medicalCertificate;
        boolean feePaid;
        boolean assignmentsSubmitted;

        System.out.print("Enter attendance percentage: ");
        attendance = sc.nextDouble();

        System.out.print("Is the medical certificate approved? (true/false): ");
        medicalCertificate = sc.nextBoolean();

        System.out.print("Is the examination fee paid? (true/false): ");
        feePaid = sc.nextBoolean();

        System.out.print("Are all assignments submitted? (true/false): ");
        assignmentsSubmitted = sc.nextBoolean();

        // Check registration eligibility
        boolean eligible =
                (attendance >= 75 ||
                (attendance >= 65 && medicalCertificate))
                && feePaid
                && assignmentsSubmitted;

        // Ternary operator to determine the result
        String result = eligible
                ? "Registration Successful"
                : "Registration Rejected";

        System.out.println(result);

        sc.close();
    }
}