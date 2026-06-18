import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maximumoccurence {

    public static void main(String[] args) {
        int[]a={12,1,1,1,1 };
        Arrays.sort(a);
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(30);
        a2.add(20);
        a2.add(10);
        Collections.sort(a2);
        ArrayList<String>a3=new ArrayList<>();
        a3.add("Virat");
        a3.add("rohit");
        a3.add("rabada");
        Collections.sort(a3);
        // internally it sorts based on its ascii values a-97 
        int maxfrequency=0;
        int count=1;
        int ans=0;
        for(int i=0;i<a.length-1;i++){

           if(a[i]==a[i+1]){
             count++;
             
           }
           
           else{
             if(maxfrequency<count){
                maxfrequency=count;
                ans=a[i];
             }
             count=1;
           }
           
        }
        System.out.println(ans);
    }
}
