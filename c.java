import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(a);
        
        
        for (int i = 0; i < x; i++) {
            int c = sc.nextInt();
            
            int count = 0;
            boolean g = true;

            int low = 0;
            int high = a.length - 1;
            while (low <= high) {
                int middle = (low + high) / 2;

                if (a[middle] == c) {
                    count += middle + 1;
                    if(count==)
                    low=middle+1;
                    g = false;
                    
                } else if (a[middle] > c) {

                    high = middle - 1;
                } else {

                    low = middle + 1;
                }
            }

            if (g) {
                System.out.println(high+1);

            } else {
                System.out.println(count);
            }

        }
       

    }
}