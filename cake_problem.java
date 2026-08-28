import java.util.Scanner;

public class cake_problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
           // when white goes first
           long  w=0;
           long d=0;
           long capacity=1;
           long capacity2=2;
           long sum=1;
           long sum2=2;
           while(sum<=a){
             capacity*=(4);
             sum+=capacity;
             w++;
            }
            
           while(sum2<=b){
            
             capacity2=capacity2*((4));
             sum2+=capacity2;
             d++;
             
            }
           long wf=2*Math.min(w, d)+(w > d ? 1 : 0);
           // when dark goes first
           long w1=0;
           long d1=0;
           long capacity1=1;
           long capacity21=2;
           long sum3=1;
           long sum4=2;
           while(sum3<=b){
             capacity1*=(4);
             sum3+=capacity1;
             d1++;
             }
           while(sum4<=a){
             capacity21=capacity21*((4)); 
             sum4+=capacity21;
             w1++;
            
           }
           long df=2*Math.min(w1, d1)+(d1>w1? 1 : 0);
           System.out.println(Math.max(wf, df));
        }
        sc.close();
    }
}