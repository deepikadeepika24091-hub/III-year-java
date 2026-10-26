import java.util.Scanner;

public class Employebonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, bonus, finalSalary;
        int score, projects;
        int bonusPercent;

        System.out.print("Enter employee salary: ₹");
        salary = sc.nextDouble();

        System.out.print("Enter performance score: ");
        score = sc.nextInt();

        System.out.print("Enter completed projects: ");
        projects = sc.nextInt();

        // Nested ternary and logical operators
        bonusPercent = (score >= 90 && projects >= 3) ? 15
                     : (score >= 75 || projects >= 5) ? 10
                     : (score >= 60) ? 3 : 0;

        // Calculate bonus and final salary
        bonus = salary * bonusPercent / 100.0;
        finalSalary = salary + bonus;

        System.out.println("Bonus Percentage: " + bonusPercent + "%");
        System.out.println("Bonus Amount: ₹" + bonus);
        System.out.println("Final Salary: ₹" + finalSalary);

        sc.close();
    }
}