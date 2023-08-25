import java.util.*;
public class ASS3A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int max=(a>b && a>c)?a:(b>c?b:c);
        System.out.println(max);
        sc.close();
        

    }

    
}
