import java.util.*;

public class validsudoko {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = sc.next().charAt(0);
      }
    }
    sc.close();
    if (iscorrect(board,0,0)) {
      System.out.println("correct");
    } else {
      System.out.println("incorrect");
    }
  }
  public static boolean iscorrect(char[][] board, int row, int column){
    if(row==9){
      return true ;
     }
     if(column==9){
       return  iscorrect(board, row+1, 0);
     }
     if(board[row][column]=='.'){
      return iscorrect(board, row, column + 1);
     }
  char ch = board[row][column];                    // save
board[row][column] = '.';                        // blank it so it doesn't match itself
boolean ok = safe(board, row, column, ch - '0');
board[row][column] = ch;                         // restore

  if (!ok) return false;
  return iscorrect(board, row, column + 1);
     
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
