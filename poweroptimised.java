import java.util.Scanner;
//tc->0(logn)
public class poweroptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int X,N;
        X = sc.nextInt();        
        N = sc.nextInt();

        System.out.println(power(X,N));		
    }

	public static long power(int x, int y)
    {   
        if(y==0)return 1;
		int halfpow=(int)power(x, y/2);
        int power=halfpow*halfpow;
        if(y%2==1){
            power=power*x;
        }
        return (long)power;

    }
}
