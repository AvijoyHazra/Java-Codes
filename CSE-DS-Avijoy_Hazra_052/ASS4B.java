import java.util.Scanner;
public class ASS4B {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of fibonacci number you want to display");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []fibo=new int[n];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=0;i<n;i++)
        {
           if(i==0||i==1)
           {
            System.out.print(fibo[i]+" ");
           }
           else
           {
            fibo[i]=fibo[i-1]+fibo[i-2];
            System.out.print(fibo[i]+" ");
           }
            sc.close();
        }
    }
}
