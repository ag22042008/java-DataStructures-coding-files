import java.util.*;

public class disha {
    // solved by ai
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        while(n-->0&&m-->0){
            count++;
        }
        if(count%2==0){
            System.out.println("Malvika");
        }
        else{
            System.out.println("Akshat");
        }
        //complexity will be 0(n*m)
        
    }
}