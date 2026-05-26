import java.io.*;
import java.util.*;
public class Main {
    public static void parenthesisChecker(String exp)
        {
            Stack <Character>s =new Stack<>();
          for(int i=0;i<exp.length();i++){
          
             if((exp.charAt(i)=='(')||(exp.charAt(i)=='{')||(exp.charAt(i)=='[')){
                s.add(exp.charAt(i));
             }
             if((!s.isEmpty())&&(exp.charAt(i)==')')&&(s.peek()=='(')){
                s.pop();
             }
             else if ((!s.isEmpty())&&(exp.charAt(i)==']')&&(s.peek()=='[')){
                s.pop();
             }
             else if((!s.isEmpty())&&(exp.charAt(i)=='{')&&(s.peek()=='}')){
                s.pop();
             }
          }
          if(s.isEmpty()){
            System.out.println(1);
          }
         else{ System.out.println(0);}
         System.out.println(s.toArray());
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        parenthesisChecker(s);
    }
}