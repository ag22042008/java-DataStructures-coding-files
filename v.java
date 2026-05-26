import java.util.*;

  


public class v {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //   System.out.println("Aditya Gupta");
      //  for(int i=1;i<=10;i+=1){
      //    System.out.println(i+"-> "+i*2);
      //  }
      //  for (int i = 10; i >=1; i-=1) {
      //      System.out.println(i);
      //  }
       int n=sc.nextInt();
       int sum=0;
       while(n>0){
          sum+=(n%10);
          n=n/10;

       }
       System.out.println(sum);
      int g=Math.powExact(sum, n)
    }
}