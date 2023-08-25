import java.util.*;
public class ASS1B {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double radius,area,perimeter;
        System.out.println("Enter the radius of the circle");
        radius=sc.nextDouble();
        area=3.14*radius*radius;
        perimeter=2*3.14*radius;
        System.out.println("The area is "+area+",the perimeter is "+perimeter);
        sc.close();
    }
    
}
