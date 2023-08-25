import java.util.Scanner;
public class ASS3C {
    public static void main(String[] args)
    {
        int leap;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        leap=sc.nextInt();
        if(leap%100==0)
        {
            if(leap%400==0){
                System.out.println(leap+" is leap year");
            }
            else
            {
                System.out.println(leap+" is not a leap year");
            }
        }
        else if(leap%4==0)
        {
            System.out.println(leap+" is leap year");
        }
        else
        {
            System.out.println(leap+" is not a leap year");
        }

    }
    
}
