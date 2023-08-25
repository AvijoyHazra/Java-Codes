import java.util.*;
public class ASS4D {
    static boolean ispalindrome(int n)
    {
        int sum=0;
        for(int i=n;i>0;i/=10)
        {

            sum=(i%10)+(10*sum);
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(ispalindrome(n))
        {
            System.out.println("it is palijndrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }


    }
    
}
