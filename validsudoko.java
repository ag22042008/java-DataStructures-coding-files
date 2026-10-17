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
    if (isValidSudoku(board)) {
      System.out.println("correct");
    } else {
      System.out.println("incorrect");
    }
  }

  public static boolean isValidSudoku(char[][] board) {
     HashSet<Character>s=new HashSet<>();
     boolean v=true;
     helper(board,0,0,s,v);
     return v;
  }

  private static void helper(char[][] board, int i, int j,HashSet<Character>s,boolean v) {
     
    

  }
}
