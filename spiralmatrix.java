import java.util.Scanner;


class Solution {
    public int[] spiralMatrix(int[][] mat, int n, int m) {
        int[] matrix = new int[(m * n)];
        int index = 0;
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                matrix[index] = mat[i][left];
                index++;
            }
            left++;
            for (int i = left; i <= right; i++) {
                matrix[index] = mat[bottom][i];
                index++;
            }
             bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[index] = mat[i][right];
                    index++;
                }
                right--;

            } 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[index] = mat[top][i];
                    index++;
                }
                top++;
            }
        }
        return matrix;

    }
}

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int[] result = ob.spiralMatrix(matrix, n, m);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}