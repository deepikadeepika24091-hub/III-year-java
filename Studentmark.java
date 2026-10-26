import java.util.Scanner;
public class Studentmark{
    public static void main(String[] args){
      Scanner s1=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=s1.nextInt();
        System.out.println("Enter the attendance:");
        int attendance=s1.nextInt();
        String result=((mark>40)&&(attendance>75))?"pass":"fail";
        System.out.println(result);
        s1.close();
    }
}