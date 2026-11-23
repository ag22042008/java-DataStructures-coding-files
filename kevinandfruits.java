import java.util.*;

public class kevinandfruits {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution2210.getMaxMarker(arr, n, m);
        System.out.println(ans);
        sc.close();
    }
}
class Solution2210 
{   static boolean ispossible(ArrayList<Integer> arr,int marker,int n,int m){
       int fruitseaten=0;
       for(int i=0;i<arr.size();i++){
          if(arr.get(i)>=marker){
              if(arr.get(i)==marker){
                 fruitseaten+=0;
              }
              else{
                fruitseaten=fruitseaten+(arr.get(i)-marker);
              }
          }
       }
       return fruitseaten>=m;
}
    static int getMaxMarker(ArrayList<Integer> arr, int n, int m) 
    {
       int s = 1;
       int e = Collections.max(arr);
       int ans = 0;
       
       while (s <= e) {
         int middle = s + (e - s) / 2;
         if (ispossible(arr, middle,n, m)) {
         ans = middle;
         s = middle+1;
         } else {
        e = middle-1;
       }
       }
     return ans;
    }
}
