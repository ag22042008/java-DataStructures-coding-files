import java.util.*;

public class shufflestring {
    
    static void shuffleString2(int[] indices, String s) {
      // for a shuffleing problem choose a char array
      int n=indices.length;
      char[]s2=new char[n];
      for(int i=0;i<n;i++){
         s2[indices[i]]=s.charAt(i);
      }
      for (char c : s2) {
         System.out.print(c);
      }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        shuffleString2(arr, str);
        sc.close();
        System.out.println(Math.max(2,3));
    }
}
