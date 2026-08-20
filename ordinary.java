import java.util.Scanner;

public class ordinary{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            int digits=0;
            int y=x;
            while(y>0){
               digits++;
               y=y/10;
            }
            int ordinarynos=9*(digits-1);
            
            int first=x/(int)Math.pow(10, (digits-1));
            int number=0;
            int di=digits-1;
            
            while(di>=0){
                number+=first*(Math.pow(10, di));
                di--;
            }
            ordinarynos=ordinarynos+(first-1);
            if(x==number){
                 ordinarynos++;
            }
            else if(x>number){
                ordinarynos++;
            }
          


            if(x>10) {
             System.out.println(ordinarynos);
            }
            else if(x==10){
                System.out.println(9);
            }
            else {
                System.out.println(x);
            }
            
        }
    }
}