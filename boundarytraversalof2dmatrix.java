import java.util.*;
//1  -2 - 3       -4
//|            |
//11           5
//|            |
//10 -9 -8 7 -  6
//o(n) complexity
public class boundarytraversalof2dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
         //i-->row j-->column
         if(m==1){
            for(int j=0;j<n;j++){
                    System.out.println(matrix[0][j]);
            }
         }
         else if(n==1){
            for(int i=0;i<m;i++){
                 System.out.println(matrix[i][0]);
         }
         }
         else {
            for(int j=0;j<n;j++){
             System.out.print(matrix[0][j]+" ");
           }
          for(int i=1;i<=m-1;i++){
            
               System.out.print(matrix[i][n-1]+" ") ; 
            }
          for(int j=n-2;j>=0;j--){
             System.out.print(matrix[m-1][j]+" ");
          }
          for(int i=m-2;i>0;i--){
            System.out.print(matrix[i][0]);
          }
         }
        }
        
       
    }

