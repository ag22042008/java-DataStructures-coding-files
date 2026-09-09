
import java.util.*;
import java.io.*;
//worst case complexity when array is sorted n2 solved by an if we make it randomised  random element quick sort then always nlogn
//tc->case nlogn
class Solution{
	   static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int l, int r){
        //randomised quick sort
        int random=(int)Math.random()*(r-l+1)+l;
        swap(arr,random,r);
        int pivot = arr[r];
        int left=l-1;
       
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivot){
                left++;
                swap(arr,left,i);
            }
        }
        swap(arr,left+1,r);
        return left+1;// pivot will be at right place
    }

    static void quicksorthelper(int []arr,int l,int r){
        if (l >= r)
            return;
        int partion=partition(arr,l,r);
        quicksorthelper(arr, l, partion-1);//partion
        quicksorthelper(arr, partion+1, r);//
    }
	void quickSort(int[] arr){
        int l=0;
        int r=arr.length-1;
        quicksorthelper(arr,l,r);
    }
}

class quickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
