import java.util.Scanner;
public class Multiplytable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the i value");
        int i=sc.nextInt();
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(i=1;i<=20;i++){
            System.out.println(i+"x"+n+"="+(i*n));
        }
    }
}