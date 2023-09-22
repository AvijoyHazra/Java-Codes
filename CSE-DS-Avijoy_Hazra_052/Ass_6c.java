import java.util.Scanner;

public class Ass_6c {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("ENter the elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.printf(
                    "press 1:For Bubble sort\npress 2:For insertion sort/npress 3:For selection sort\npress 3:For insertion sort\npress any other key:to exit");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("The unsorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (a[j] > a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("The sorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                case 2:
                    int key, j;
                    System.out.println("The unsorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    for (int i = 1; i < n; i++) {
                        key = a[i];
                        for (j = i - 1; j >= 0 && a[j] > key; j--) {
                            a[j + 1] = a[j];
                        }
                        a[j + 1] = key;
                    }
                    System.out.println("The sorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                case 3:
                    int min;
                    System.out.println("The unsorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    for (int i = 0; i < n - 1; i++) {
                        min = i;
                        for (j = i + 1; j < n; j++) {
                            if (a[j] < a[min]) {
                                min = j;
                            }
                        }
                        if (min != i) {
                            int temp = a[i];
                            a[i] = a[min];
                            a[min] = temp;
                        }
                    }
                    System.out.println("The sorted array is");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.exit(0);

            }
        }

    }

}
