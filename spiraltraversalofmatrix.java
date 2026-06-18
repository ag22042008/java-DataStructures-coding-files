import java.util.Scanner;

public class spiraltraversalofmatrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }

        spirallyTraverse(mat);     
        System.out.println('\n');
    }
    //time complexity-o(m*n)
    //space-0(1)
    public static void spirallyTraverse(int [][]mat) {
        
        int top=0;
        int left=0;
        int bottom=mat.length-1;
        int right=mat[0].length-1;
        while(top<=bottom&&left<=right){ //cross condition
            for (int i = left; i <=right; i++) {
                 System.out.print(mat[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){                                     //left<=right check as agar ye cross hogya to sare columns covered hai aise hi for rows wla top bottom check
                for (int i = bottom; i >=top; i--) {
                    System.out.println(mat[i][left]);
                }
                left++;
            }
        }
         
     
    }
}
