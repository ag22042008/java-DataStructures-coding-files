import java.util.*;
import java.io.*;

public class panagrams{
     public  static void isPangram(String s)
      {
           HashSet<Character> g = new HashSet<>(); 
 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
               if(ch!=' '){
                 g.add( ch);
                }
            
        }
       
 
                if (g.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
          
    }}
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
