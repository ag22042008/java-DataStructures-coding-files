import java.util.*;

 class maximaMinima {
    public static int maximaMinima1(int[][] mat) {
         int r=mat.length;
         int c=mat[0].length;
         int[]minrow=new int[r];//fetching min in a row 
         int[]maxcolumn=new int[c];//fetching max in a column comparing both a same element will give the ans 
         for(int i=0;i<r;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
            }
            minrow[i]=min;
         }
         for(int i=0;i<c;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
                if(mat[j][i]>max){
                    max=mat[j][i];
                }
            }
            maxcolumn[i]=max;
         }
        int h=0; 
        while(h<minrow.length){
         for(int i=0;i<maxcolumn.length;i++){
            if(minrow[h]==maxcolumn[i]){
                return minrow[h];
            }
        }
        h++;
        }
         
     return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima1(matrix);
        System.out.println(result);
        sc.close();
    }
}
