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
    System.out.println();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
    
  }

  public static void solveSudoku(char[][] board) {
    
    helper(board,0,0);
  }

  public static boolean helper(char[][] board, int row, int column) {
     if(row==9){
      return true ;
     }
     if(column==9){
       return  helper(board, row+1, 0);
     }
     if(board[row][column]!='.'){
      return helper(board, row, column+1);
     }
     for (int i = 1; i < 10; i++) {
        if(safe(board,row,column,i)){
           board[row][column]=(char) (i+'0');
           if(helper(board, row, column+1)){
              return true;
           }
           else{
            board[row][column]='.'; // backtracking steps
           }

        }
     }
     return false;
  }

  public  static boolean safe(char[][] board, int row, int column, int value) {
     for(int i=0;i<9;i++){
        if(board[row][i]== value + '0'){
           return false;
        }
     }
      for(int i=0;i<9;i++){
        if(board[i][column]== value + '0'){
           return false;
        }
     }
     int i1=(row/3)*3;
     int i2=(column/3)*3;
     for(int a=0;a<3;a++){
       for(int b=0;b<3;b++){
          if(board[a+i1][b+i2]=='0'+value){
            return false;
          }
       }
     }
     return true;
  }

}