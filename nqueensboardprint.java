import java.util.*;

public class nqueensboardprint{
   public static boolean issafe(int n,int[][]board,int row ,int column){
        //upper rows me check
        for (int i = 0; i <row; i++) {
            if(board[i][column]==1){
                return false;
            }
            
        }
        // main diagonal me check
        int row1=row-1;
        int column1=column-1;
        while (row1>=0&&column1>=0) {
            if(board[row1][column1]==1){
                return false;
            }
            row1--;
            column1--;
        }
        // antidiagonal me check
        int row2=row-1;
        int column2=column+1;
        while (row2>=0&&column2<n) {
            if(board[row2][column2]==1){
                return false;
            }
            row2--;
            column2++;
        }
        return true;
    }
    public static void placequeens(int n,int[][]board,int row){
        if(row==n){
            for (int i = 0; i < board.length; i++) {
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(issafe(n,board,row,i)){
                board[row][i]=1;// placing the queen at each column cell at a particular row to make new configurations
                placequeens(n, board, row+1);
                board[row][i]=0;//now remove the queen once we get the stable configuration to get a new configuration
             }
        }
        
    }
    public static void totalNQueens(int n) {
        int [][]board=new int [n][n];
        placequeens(n,board,0);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        totalNQueens(n);
    }
}