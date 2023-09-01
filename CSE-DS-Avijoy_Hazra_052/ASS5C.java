public class ASS5C{
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("The special numbers are");
        int sum;
        for(int i=100;i<=999;i++)
        {
            sum=0;
            for(int j=i;j>0;j/=10)
            {
                sum+=fact(j%10);
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
        }
        
    }
}