import java.util.Scanner;

public class arraysubtraction {

     static void subtract(int[] n1, int[] n2) {
        if(n1.length<n2.length){
            System.out.println();
        }
     }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

     subtract(arr1, arr2);
    
  }
}
