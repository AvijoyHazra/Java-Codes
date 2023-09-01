import java.util.*;
public class ASS5A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        System.out.println("press 1:For star pattern,press 2:For alphabet pattern,press 3:For space pattern,press any other keyh:For exit");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int a=65;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        if(a==91)
                            a=65;
                        System.out.printf("%c ",a++);
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=1;i<=n;i++)
                {
                    int b=1;
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.printf("%d",b++);
                    }
                    System.out.println();
                }
                break;
            default:
                System.exit(0);
        }
        

    }
}