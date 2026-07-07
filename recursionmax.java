import java.io.*;
import java.util.Scanner;

public class recursionmax {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums);
        System.out.print(result);
    }
  
    static int solve (int []arr,int b){
        if(b>=arr.length){
            return Integer.MIN_VALUE;
        }
        int x= solve(arr,b+1);
        return Math.max(x,arr[b]);
    }
    public static int maxElement(int[] arr){
       int x=solve(arr,0);
       return x;
    }
}
