import java.util.Scanner;
public class Batterycharging{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Battery percentage");
    int Batper=sc.nextInt();
    System.out.println("Enter the temp");
    int Temparature=sc.nextInt();
    boolean allowed=(Batper<90)&&(Temparature<10 && Temparature<45);
    System.out.println(allowed);
    String Status=(allowed?"allowed":"not allowed");
    System.out.println(Status);
    Batper= Batper +5;
     sc.close();
    }
}