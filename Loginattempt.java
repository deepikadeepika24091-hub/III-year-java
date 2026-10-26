import java.util.Scanner;
public class Loginattempt{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Maximum attempt count");
        int Maxattempt=sc.nextInt();
        System.out.println("Current failed attempt");
        int failedattempt=sc.nextInt();
      if((failedattempt<Maxattempt)){
        System.out.println("Login attempt allowed");
        failedattempt++;
        System.out.println(failedattempt<Maxattempt && true ?"allowed":"not allowed");
      }else
      {
       System.out.println("Account locked");
      }
      sc.close();
    }
}