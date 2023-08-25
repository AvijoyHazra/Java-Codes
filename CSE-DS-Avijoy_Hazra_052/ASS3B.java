import java.util.Scanner;
import java.lang.Math;

public class ASS3B {
    public static void main(String[] args)
    {
        double a,b,c,root1,root2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b and c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        if(((b*b)-(4*a*c))>=0)
        {
            if(((b*b)-(4*a*c))==0)
            {
                root1=-b/(2*a);
                System.out.println("The roots are equal,the value is "+root1);
            }
            else
            {
                root1=(-b+Math.sqrt(((b*b)-(4*a*c))))/(2*a);
                root2=(-b-Math.sqrt(((b*b)-(4*a*c))))/(2*a);
                System.out.println("The roots are "+root1+" "+root2);
            }

        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
    
}
