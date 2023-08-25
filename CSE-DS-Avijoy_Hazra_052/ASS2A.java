
import java.util.*;
public class ASS2A {
    public static void main(String[] args)
    {
        double a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("The values of a is "+a+" b is "+b);
        /*b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("The new values of a is "+a+" b is "+b);
        sc.close();*/
        temp=a;
        a=b;
        b=temp;
        System.out.println("The new values of a is "+a+" b is "+b);
        sc.close();


    }
    
}
