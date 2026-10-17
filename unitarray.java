import java.util.Scanner;

public class unitarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int s=sc.nextInt();
            int []a=new int[s];
            int n1=0;
            int p1=0;
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
                if(a[i]<0){
                    n1++;
                }
                else{
                    p1++;
                }
            }
            
        }
    }
}
