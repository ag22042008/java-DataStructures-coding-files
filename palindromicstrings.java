import java.io.*;
import java.util.*;

public class palindromicstrings {
	static int isPalindrome(String j)
      {
        StringBuilder s=new StringBuilder();
        StringBuilder e=new StringBuilder();
        int n=j.length();
        for (int i = 0; i <n; i++) {
            if((j.charAt(i)>='a'&&j.charAt(i)<='z')||(j.charAt(i)>='A'&&j.charAt(i)<='Z')){
                s.append(Character.toLowerCase(j.charAt(i)));
            }
        }
        for (int i = n-1; i >=0; i--) {
            
             if((j.charAt(i)>='a'&&j.charAt(i)<='z')||(j.charAt(i)>='A'&&j.charAt(i)<='Z')){
                  
                    e.append(Character.toLowerCase(j.charAt(i)));
            }
        }
        String s2=s.toString();
        String e2=e.toString();
        
         if(s2.equals(e2)){
           return 1;
         } 
         
         return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
