import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          while(n-->0){
             int d=sc.nextInt();
             double g=d/2+1;
             
              int count=1;
             for(int i=1;i<=g;i++){
               for(int j=1;j<=g-i;j++){
                     System.out.print(" ");
                   }
                   for(int j=1;j<=count;j++){
                    if (j==1||j==count)
                      { 
                        System.out.print("*");
                      }
                    else{
                      System.out.print(" ");
                    }
                   }
                   count+=2;
                   System.out.println();
                
              }
                   count=count-4;
             for(int i=1;i<=d-g;i++){
               for(int j=1;j<=i;j++){
                  System.out.print(" ");
               }
               
               for(int j=1;j<=count;j++){
                 if(j==1||j==count) { System.out.print("*");
                  
                 }
                 else{
                   System.out.print(" ");
                 }
               }
               count=count-2;
               System.out.println();
          }
          }
    }
}
