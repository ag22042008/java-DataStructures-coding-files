import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);// scanner class making
    //    boolean [][]a=new boolean [3][4];
    //     System.out.println(a[0][0]);
    //     // for number of rows
    //     for(int i=0;i<3;i++){
    //      for (int j = 0; j < 4; j++) {
    //         a[i][j]=4;
    //      }
    //     }
        // a matrix of dimensions n*n will have a total of n*n elements
        // a 2d array of size n*m means there are n one d arrays of size m
        // jagged matrix no of columns can be different in every row
        // 3*3 a squared matrix
        //[3 4 3
         //1 2 3
         //4 3 1]
         // major diagonal --3 2 1 , 3 2 4(anti major diagonal i+j==n-1)
         // minor diaagonal-4 , 1 3,4 3 ,3
         // every diagonal of  a matrix can be identified by some unique mathematical operations like focus on j-i==k (some constant ),j+i==k,j==i only+- relation
         int n=sc.nextInt();// no of rows
         int m=sc.nextInt();// no of columns 
         int [][]g=new int[n][m];//matrix decleration
         int product=1;

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                g[i][j]=sc.nextInt();
            }
         }
         int sum=0;
         for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                sum+=g[i][j];
                product*=g[i][j];
            }
         }
         System.out.println(sum);
         System.out.println(product);
            for(int i=0;i<n;i++){
                int sumr=0;
            for (int j = 0; j < m; j++) {
               sumr+=g[i][j];
            }
            System.out.println("sum of"+(i+1)+"row"+" "+sumr);
         }
            }
}
