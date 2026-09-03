import java.io.*;
import java.util.*;


public class mazepaths {

  


    public static void helper(int sr, int sc, int dr, int dc, ArrayList<String> g, String ans){
        if(sr>=dr||sc>=dc){
            return;
        }
        if(sr==(dr-1)&&sc==(dc-1)){
            g.add(ans);
            return;
        }
       // 2 steps allowed so we can loop through the logic sbse tough version steps==n
       for( int steps=1;steps<=2;steps++){
           helper(sr, sc+steps, dr, dc, g, ans+'h'+steps);
       }
       // for rows
        for( int steps=1;steps<=2;steps++){
           helper(sr+steps, sc, dr, dc, g, ans+'v'+steps);
       }
       //for diagonals
        for( int steps=1;steps<=2;steps++){
           helper(sr+steps, sc+steps, dr, dc, g, ans+'d'+steps);
       }
    }
    public static ArrayList<String> allPossiblePaths(int n, int m) {
       ArrayList<String> g=new ArrayList<>();
        helper(0,0,n,m,g,"");
        return g;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }

}
