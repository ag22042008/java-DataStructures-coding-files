
import java.util.*;

class Solution {
     public static void helpersubsets(int[]arr,int target,int idx,ArrayList<ArrayList<Integer>>s,ArrayList<Integer>a){
        if(target==0){
            s.add(new ArrayList<>(a));
            return;
        }
        if(idx>=arr.length||target<0){
            return;
        }
       
        
        a.add(arr[idx]);
        helpersubsets(arr,target-arr[idx],0,s,a);
        a.remove(a.size()-1);//backtracking
        helpersubsets(arr,target,idx+1,s,a);
    }
    public static void coinChange2(int[] coins, int amt){
         ArrayList<ArrayList<Integer>>s =new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        
        helpersubsets(coins,amt,0,s,a);
        for (ArrayList d : s) {
            for(int i=0;i<=d.size();i++){
                System.out.print(d.get(i)+" ");
            }
            System.out.println();
        }
    }
}

public class coinspermute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange2(coins, amt);
    }
}
