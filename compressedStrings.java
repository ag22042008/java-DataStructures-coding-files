import java.util.*;
import java.io.*;

public class compressedStrings {
	static void compressedString(String s) {
       //most imp problem
        int n=s.length();
        int count=1;
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(s.charAt(i));
                if(count>1){
                    System.out.print(count);
                }
                count=1;
            }
        }
        //for last character
        System.out.print(s.charAt(n-1));
        if(count>1){
            System.out.print(count);
        }
            
        
      
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}


