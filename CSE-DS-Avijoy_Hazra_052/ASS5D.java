import java.util.*;
public class ASS5D
{
    static boolean isprime(int n)
    {

        for(int i=2;i<=Math.sqrt(n);i++)
        {
        
            if(n%i==0)
            {
                return false;
            }
        }
            return true;
    }
    static boolean ismagic(int n)
    {
        if((n-1)%9==0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(!isprime(i) && ismagic(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}