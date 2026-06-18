import java.util.HashMap;

class Accio {
    public void duplicates(int[] arr) {
      
}

        
    }


public class as {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        Obj.duplicates(arr);
        sc.close();
        int d=1234;
        int reverse=0;
        while(d>0){
            reverse=reverse*10+(d%10);
            d=d/10;
        }
        System.out.println(reverse);
    }
}
