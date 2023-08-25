import java.util.*;

public class ASS4E {
    static boolean ismagic(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        if (sum == 1)
            return true;
        else if (sum < 10) {
            return false;
        } else {
            return ismagic(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter a range");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (ismagic(i)) {
                System.out.println(i + " ");
            }

        }

    }

}
