import java.lang.reflect.Array;
import java.util.Arrays;

public class splittting_a_string {
    public static void main(String[] args) {
        String j="Hello,kunal,dsa";
        String[]g=j.split(",");
        System.out.println(Arrays.toString(g ));
        String a="acciojob";
        String[]b=a.split("i");
        System.out.println(Arrays.toString(b));
       // System.out.println(Integer.parseInt("cd")); gives error
       int max=Integer.MIN_VALUE;
    }
}
