import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// tc -n! n length ke kitne ans n factorial

class Accio {
    public void helper(String str,Set<String> s ,String ans){
        if(str.length()==0){
            s.add(ans);
            return;
        }
        for (int i = 0; i <str.length(); i++) {
            char c=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            helper(rem, s, ans+c);
            
        }
        
    }
    public void printPermutations(String str) {
        char[]c=str.toCharArray();//for lexographical oreder print
        Arrays.sort(c);
        String k = new String(c); // sorted order string passed
        Set<String>s=new TreeSet<>();//to prevent lexographical oreder +unique permutations aba aba like in aab
        helper(k,s , "");
    }
}
public class permutationsofstring {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printPermutations(str);
        sc.close();
    }
}

