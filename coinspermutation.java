
import java.util.*;
// imp if sequence is not imp in a subset...
class Solution {
    public static void helper(int[] coins,int amount,int index,String coinstaken,boolean[] visited){
        if(amount==0){
            System.out.println(coinstaken);
            return;
        }
        if(index>=coins.length||amount<0){
            return;
        }
        if(visited[index]==false){
            visited[index]=true;
            helper(coins, amount-coins[index], 0, coinstaken+coins[index]+" ", visited);
            visited[index]=false; // as it can be used by another succeding index as a new pair backtracking one coin can be taken in its one time during in its taken call
        }
        helper(coins, amount, index+1, coinstaken, visited);
        
    }
    public static void coinChange(int[] coins, int amt){
        boolean[]visited=new boolean[coins.length];
        helper(coins,amt,0,"",visited);
        
    }
}

public class coinspermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange(coins, amt);
    }
}
