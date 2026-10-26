import java.util.Scanner;
public class Passwordvalidator{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the password:");
        String password=s1.nextLine();
        boolean accountactive=true;
        String result=((password.length() >=8)&&(accountactive))?"valid password":"invalid password";
        s1.close();
        System.out.println(result);
    }
}