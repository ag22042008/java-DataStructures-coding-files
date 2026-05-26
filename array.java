import java.util.Scanner;
import java.util.Stack;

public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        // Stack<Integer>s=new Stack<>();
        // while (n-->0) {
        //    s.add(sc.nextInt());

        // }
        // int groups=1;
        // for (int i = 0; i < s.size()-1; i++) {
        //     if(s.get(i)!=s.get(i+1)){
        //         groups++;
        //     }
        // }
        // System.out.println(groups);
        // for (int i = 1; i <=10; i++) {
        //     if(i==5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        //  for (int i = 1; i <=10; i++) {
        //     if(i==5){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        int []arr=new int[6];
        //generate all unordered numbers (1,3) (3,1) same
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 System.out.println("("+arr[i]+","+j+")");
             }
        }
        //for ordered pairs
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {   //generate the order pairs from starting as we begin from 0
                 System.out.println("("+arr[i]+","+j+")");
             }
        }
    }
}