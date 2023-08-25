import java.lang.*;
import java.util.*;
public class ASS2B {

    public static void main(String[] args)
    {
        double basic,agp,da,hra,merged_basic,salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic pay");
        basic=sc.nextDouble();
        agp=0.5*basic;
        merged_basic=agp+basic;
        da=0.5*merged_basic;
        hra=0.15*merged_basic;
        salary=hra+da+basic;
        System.out.println("The total salary is "+salary);
        sc.close();

    }
}
