import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ds {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int [n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            

        }
      
      
            boolean k=true;
           
            int[][]pairs=new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <2; j++) {
                    if(j==0){
                        pairs[i][j]=a[i];
                    }
                    else{
                        pairs[i][j]=b[i];
                    }
                     
                 }
            }
             Arrays.sort(pairs, (a1, b1) -> Integer.compare(a1[0], b1[0]));
             
             for (int i = 0; i < pairs.length; i++) {
                
                if(s<=pairs[i][0]){
                    k=false;
                    break ;
                }
                else{
                    s+=pairs[i][1];
                }
             }
           
            if(k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO") ;
            }
           
        
          
           
        
       }
       
    }
