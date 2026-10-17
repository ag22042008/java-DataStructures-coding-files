public class nqueens{
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
    public static int placequeens(int n,int[][]board,int row){
        if(row==n){
            return 1;
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(issafe(n,board,row,i)){
                board[row][i]=1;// placing the queen at each column cell at a particular row to make new configurations
                count+=placequeens(n, board, row+1);
                board[row][i]=0;//now remove the queen once we get the stable configuration to get a new configuration
             }
        }
        return count;
    }
    public static int totalNQueens(int n) {
        int [][]board=new int [n][n];
        return placequeens(n,board,0);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        System.out.println(totalNQueens(n));
    }
}