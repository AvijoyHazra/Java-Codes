import java.util.Scanner;

public class Ass_6d {
    static int linear_search(int a[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;

    }

    static int binary_search(int a[], int key, int n) {
        int low, high, mid;
        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;

            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("press 1:For linear search\npress 2:for binary search\n");
        int c = sc.nextInt();
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        switch (c) {
            case 1:
                int pos = linear_search(a, key, n);
                if (pos == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Found at position " + (pos + 1));
                }
                break;
            case 2:
                pos = binary_search(a, key, n);
                if (pos == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Found at position " + (pos + 1));
                }
                break;
        }
    }

}
