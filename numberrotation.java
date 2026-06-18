import java.util.Arrays;
import java.util.Scanner;

public class numberrotation{
    public static int[] rotate(int[]p,int m){
        int temp=p[m-1];
        for(int i=m-2;i>=0;i++){
            p[i]=p[i-1];
        }
        p[0]=temp;
        return p;
    }
    public static int[] rotateno(int []a,int k){
        int n=a.length;
         k=k%n;
         if(k<0){
            k=k+n;
         }
         for (int i = 0; i <k; i++) {
            a= rotate(a,a.length);
         }
      return a;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       a= rotateno(a,k);
       System.out.println(Arrays.toString(a));
       sc.close();
    }
}