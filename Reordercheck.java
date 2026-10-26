import java.util.Scanner;
public class Reordercheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current stock");
        int custock=sc.nextInt();
        System.out.println("Enter the minimum stock level");
        int minstock=sc.nextInt();
        System.out.println("Enter the incoming stock");
        int incostock=sc.nextInt();
        incostock += custock;
        String result=(custock<minstock)?"reorder Required":"stock stufficient";
        System.out.println(result);
        sc.close();
    }
}