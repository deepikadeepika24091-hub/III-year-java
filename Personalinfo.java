import java.util.Scanner;
public class Personalinfo{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s1.nextLine();
        System.out.println("Enter your age");
        int age=s1.nextInt();
        System.out.println("Enter your city");
        String city=s1.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        s1.close();
    }
}