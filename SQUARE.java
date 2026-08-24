import java.util.Arrays;
import java.util.Scanner;

public class SQUARE {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) {
           int x1=sc.nextInt();
           int y1=sc.nextInt();
           int x2=sc.nextInt();
           int y2=sc.nextInt();
           int x3=sc.nextInt(); 
           int y3=sc.nextInt();
           int x4=sc.nextInt();
           int y4=sc.nextInt();

           int side1=0;
           
           if(x1==x2){
             side1=Math.abs(y2-y1);
           }
           else if(x1==x3){
              side1=Math.abs(y3-y1);
           }
           else if(x1==x4){
             side1=Math.abs(y4-y1);
           }
           else if(y1==y2){
             side1=Math.abs(x2-x1);
           }
           else if(y1==y3){
             side1=Math.abs(x3-x1);
           }
           else if(y1==y4){
             side1=Math.abs(x4-x1);
           }
           System.out.println(side1*side1);
        }
    }
}
