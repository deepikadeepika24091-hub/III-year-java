import java.util.Scanner;
public class Freedelivery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a order amount");
        int Oamount=sc.nextInt();
        System.out.println("You are permiummember?(true/false)");
        boolean premiummember=sc.nextBoolean();
        if(Oamount>=1000 || premiummember){
            System.out.println("free delivery");
        }
        else{
            System.out.println("add delivery amount");
            System.out.println("deliverycharge"+50);
        }
        sc.close();
    }
}