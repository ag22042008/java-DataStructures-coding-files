import java.util.*;

public class sudokusolver {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = sc.next().charAt(0);
      }
    }
    sc.close();
    solveSudoku(board);
    if (isValidSudoku(board)) System.out.println(
      "correct"
    ); else System.out.println("incorrect");
  }
  public static void helper(char[][]board,int i1 ,int j,int m,int n){

    if(i1>=m||j>=n){
        
       return; 
    }
    if(board[i1][j]!='.'){
        helper(board, i1+1, j, m, n);
        if(i1==m-1){
        helper(board, i1, j+1, m, n);}
    };
    for (int i=1;i<=9;i++) {
        if(issafe(i,i1,j)){
            if(board[i1][j]=='.'){
                board[i1][j]=(char)i;
               
            }
             helper(board, i1+1, j, m, n);
             helper(board, i1, j+1, m, n);
        }
    }
  }
  private static boolean issafe(int number,int i1,int j) { 
    int row =i1;
    for(int i=0;i<=i1;i++){
     
    }
    return true;
}
  public static void solveSudoku(char[][] board) {
    
    helper(board,0,0,board[0].length,board.length);
  }

}