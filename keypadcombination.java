import java.io.*;
import java.util.*;
//Question
// hard
// Max Score: 40
// Keypad combination
// You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone. The following list is the key to characters map

// 0 -> .;
// 1 -> abc 
// 2 -> def 
// 3 -> ghi 
// 4 -> jkl 
// 5 -> mno 
// 6 -> pqrs 
// 7 -> tu 
// 8 -> vwx 
// 9 -> yz 
// Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.

// Use sample input and output to take idea about output

// Input Format
// Input consists of one line.

// First line contains a string str.

// Output Format
// Words that can be produced by pressed keys indictated by str in order hinted by Sample output

// Example 1
// Input

// 78
// Output

// tv
// tw
// tx
// uv
// uw
// ux
// Explanation

// These are the strings that can be formed.

// tv, tw, tx, uv, uw, ux

// Example 2
// Input

// 1
// Output

// a
// b
// c
// Explanation

// These are the strings that can be formed.

// a, b, c

// Constraints
// 0 <= str.length <= 10

// str contains numbers only

// Topics
// Recursion
// Strings
// Backtracking
// Companies
// Accolite
// Flipkart
// Amazon
// Zoho
// Samsung
// Oyo Rooms
// Snapdeal
public class keypadcombination {
    static void helper(String s,int index,String ans){
        if(index>=s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(index)=='0'){
            helper(s,index+1,ans+".");
             helper(s,index+1,ans+";");
        }
        if(s.charAt(index)=='1'){
            helper(s,index+1,ans+"a");
            helper(s,index+1,ans+"b");
            helper(s,index+1,ans+"c");
        }
        if (s.charAt(index)=='2'){
            helper(s,index+1,ans+"d");
            helper(s,index+1,ans+"e");
            helper(s,index+1,ans+"f");
        }
        if (s.charAt(index)=='3'){
            helper(s,index+1,ans+"g");
            helper(s,index+1,ans+"h");
            helper(s,index+1,ans+"i");
        }
        if (s.charAt(index)=='4'){
            helper(s,index+1,ans+"j");
            helper(s,index+1,ans+"k");
            helper(s,index+1,ans+"l");
        }
        if (s.charAt(index)=='5'){
            helper(s,index+1,ans+"m");
            helper(s,index+1,ans+"n");
            helper(s,index+1,ans+"o");
        }
        if (s.charAt(index)=='6'){
            helper(s,index+1,ans+"p");
            helper(s,index+1,ans+"q");
            helper(s,index+1,ans+"r");
            helper(s,index+1,ans+"s");
        }
        if (s.charAt(index)=='7'){
            helper(s,index+1,ans+"t");
            helper(s,index+1,ans+"u");
        }
        if (s.charAt(index)=='8'){
            helper(s,index+1,ans+"v");
            helper(s,index+1,ans+"w");
            helper(s,index+1,ans+"x");
        }
        if (s.charAt(index)=='9'){
            helper(s,index+1,ans+"y");
            helper(s,index+1,ans+"z");
        }
    }
    static void printKPC(String ques) {
        helper(ques,0,"");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str);
    }
}