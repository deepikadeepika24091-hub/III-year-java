import java.util.Scanner;
public class Atmwithdrawel{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the accountbalance");
        int accountbalance =s1.nextInt();
        System.out.println("Enter the withdrawelamount");
        int withdrawelamount =s1.nextInt();
        if((withdrawelamount>0)&&(withdrawelamount %100==0)&&(withdrawelamount <= accountbalance)){
        int balance=accountbalance-withdrawelamount;
        System.out.println("Transaction successful");
        System.out.println("Remaining balance"+balance);
        }
        else{
            System.out.println("Transaction failed");
        }
    }
}