import java.util.*;
//tc->o(n)
public class nox {
    static String helper(String h,int index){
        if(index>=h.length()){
            return "";
        }
        if(h.charAt(i)!='x'){ // x na ho or fir bki recursion se ans so character+ recursion ans
            return h.charAt(i)+helper(h,index+1);
        }
        return helper(h,index+1);
        
    }
    static String noX(String s) {
       return helper(s,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}
