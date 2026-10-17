import java.util.Arrays;
import java.util.Scanner;

public class favourite_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int c = sc.nextInt();
            int[] a = new int[c];
            for (int i = 0; i < c; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            int right = a.length - 1;
            while (left <= right) {
                if (left != right) {
                    System.out.print(a[left] + " " + a[right] + " ");
                } else {
                    System.out.print( a[left]);
                }

                left++;
                right--;
            }
            System.out.println();

        }

        sc.close();
    }
}