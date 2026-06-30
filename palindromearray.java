import java.util.*;

public class palindromearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr, n));
    }
    static boolean fn(int[] arr, int n,int i){
        if(i>=n)return true;
        if(arr[i]!=arr[n-1]){
          return false;
        } 
        return fn(arr,n-1,i+1);
    }

	public static boolean isPalindrome(int[] arr, int n) {
         boolean v=fn(arr,n,0);
         return v;
    }

}
