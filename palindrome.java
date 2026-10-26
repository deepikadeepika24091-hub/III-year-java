public class palindrome{
    public static void main(String[] args){
        int a=121;
        int original=a;
        int rev=0;
        while(a>0){
        int digit=a%10;
        rev=rev*10+digit;
        a=a/10;
    }
    if(rev == original)
    {
        System.out.println("palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
}