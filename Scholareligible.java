import java.util.Scanner;
public class Scholareligible{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Student marks");
        int marks=s1.nextInt();
        System.out.println("Enter family income");
        int income=s1.nextInt();
        System.out.println("Enter Extra curricular points");
        int points=s1.nextInt();
        int Scholarship=((marks>=95&&income<200000)?100:(marks>=85&&income<400000)||(marks>=90)&&(points>=8)?50: (marks>=75)?10:0);
        System.out.println(Scholarship);
        s1.close();



    }
}