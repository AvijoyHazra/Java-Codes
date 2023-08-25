import java.util.Scanner;
public class ASS4A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and n:");
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double sum=1;
        for(int i=1;i<=n;i++)
        {
            sum*=x;
        }
        System.out.println("The value of x^n is "+sum);
        sc.close();
    }
    
}
