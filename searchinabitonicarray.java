
import java.io.*;
import java.util.*;
public class searchinabitonicarray {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();
        
        int target=sc.nextInt();

        solve ob = new solve();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);
        sc.close();
    
    }
}


class solve {
     public static int binarysearch(int key, int[] arr,int left,int right) {
        int s=left;
        int e=right;
        while(s<=e){
            int middle=(s+e)/2;
            if(arr[middle]==key){
                return middle;
            }
            else if(arr[middle]>key){
                e=middle-1;
            }
            else{
                s=middle+1;
            }
        }
        
        return -1;
    }
    public static int descendingbinarysearch(int key, int[] arr,int left,int right) {
        int s=left;
        int e=right;
        while(s<=e){
            int middle=(s+e)/2;
            if(arr[middle]==key){
                return middle;
            }
            else if(arr[middle]>key){
                s=middle+1;
            }
            else{
                e=middle-1;
            }
        }
        
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
    int n=arr.length;
    if(arr[0]>arr[1]){
        return 0; // decreasing sorted 
    }
    if(arr[n-1]>arr[n-2]){
        return n-1; // increasing sorted 
    }
       int s=1;
       int e=arr.length-2;
       while(s<=e){
         int middle=s+(e-s)/2;
         if((arr[middle]>arr[middle+1])&&(arr[middle]>arr[middle-1])) return middle;
         else if(arr[middle]<arr[middle-1])e=middle-1;
         else s=middle+1;
       }
       return -1;
    }
    int findElement(int arr[], int n,int target)
    {
        int peak=peakIndexInMountainArray(arr);
        int index1=binarysearch(target,arr,0,peak);// as first part is normal ascending array 
        int index2=descendingbinarysearch(target,arr,peak,n-1);//a  second part is decreasing array so conditions of binary search change
        
        if(index1==-1){
            
            return index2;
        }
        return index1;
        
        

    }
}
