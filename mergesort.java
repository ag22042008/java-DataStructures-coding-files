import java.util.*;
import java.io.*;
//tc->nlogn
class mergesort {
static void mergeSort(int[] arr,int l,int r){
     if(l>=r){
        return;
     }
     
     int middle=(l+r)/2;
     mergeSort(arr, l, middle);//divide 
     mergeSort(arr, middle+1, r);//divide
     merge(arr,middle,l,r);//conquer
}

        static void merge(int[] arr, int middle, int l, int r) {
            ArrayList<Integer>s=new ArrayList<>();
            int i = l;
            int j = middle + 1;
            

            while (i <= middle && j <= r) {
                if (arr[i] <= arr[j]) {
                    s.add(arr[i]);
                    i++;
                } else {
                    s.add(arr[j]);
                    j++;
                }
            }
            while(i<=middle){
                s.add(arr[i]);
                i++;
            }
            while(j<=r){
                s.add(arr[j]);
                j++;
            }
            // each sub array ke liye ye copy chlega Because s only has 4 elements (indices 0..3), but k ranges over 2..5. If you wrote arr[k] = s.get(k), at k = 4 you'd call s.get(4) — out of bounds, since s's last valid index is 3. Subtracting l re-bases k back down to 0 so it lines up with s's own indexing.
            //The general rule: whenever you build a temporary structure that represents part of an array, you need to translate between "index in the temp structure" and "index in the original array" by adding/subtracting the starting offset (l here). That's all k - l is doing.
            for (int k = 0; k <=arr.length-1; k++) {
                arr[k]=s.get(k);
            }
            
        }

public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        mergesort.mergeSort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
}