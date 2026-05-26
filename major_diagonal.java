import java.util.Scanner;

public class major_diagonal{
    public static void main(String[] args) {
        // optimised prime nos
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean k=false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("No");
                k=true;
                break;
            }
            else{
             
            }
        }
        if (!k) {
            System.out.println("Yes");
        }
    }
}