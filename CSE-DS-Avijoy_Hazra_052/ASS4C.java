
import java.util.*;

public class ASS4C {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean flag;
        System.out.println("the prime number are ");
        for (int i = n1; i <= n2; i++) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true && i != 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

}
