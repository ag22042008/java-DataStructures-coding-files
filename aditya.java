import java.util.Arrays;
import java.util.Scanner;

public class aditya{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            char[][]grid=new char[a][a];
            int r1=0;
            int r2=0;
            int c1=0;
            int c2=0;
            int count=1;
            for (int i = 0; i < grid.length; i++) {
                String j=sc.next();
                grid[i]=j.toCharArray();

            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j]=='*'&&count==1){
                      r1=i;
                      c1=j;
                      count--;
                    }
                    else if(grid[i][j]=='*'){
                        r2=i;
                        c2=j;
                    }
                }
            }
            if(r1==r2){
                if(r1!=grid.length-1){
                    grid[r1+1][c1]='*';
                    grid[r2+1][c2]='*';
                }
                else{
                    grid[r1-1][c1]='*';
                    grid[r2-1][c2]='*';
                }
            }
            else if(c1==c2){
                if(c1!=grid.length-1){
                    grid[r1][c1+1]='*';
                    grid[r2][c2+1]='*';
                }
                else{
                    grid[r1][c1-1]='*';
                    grid[r2][c2-1]='*';
                }
            }
            else if(r1 != r2 && c1 != c2){
                grid[r1][c2]='*';
                grid[r2][c1]='*';
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
    }
}