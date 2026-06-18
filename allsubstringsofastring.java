import java.util.*;
//n3 complexity
public class allsubstringsofastring {
	static void SubString(String str) {
        int n=str.length();
        
        for(int i=0;i<n;i++){
           String g="";
           for(int j=i;j<n;j++){
             g+=str.charAt(j);
             System.out.println(g);
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}