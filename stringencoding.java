import java.util.*;
// string encoding most imp and acha swal
public class stringencoding {
    public static void helper(String st,int index,ArrayList<String>s,String ch){
        if(index>=st.length()){
            s.add(ch);
            return ;
        }
        if(st.charAt(index)=='0'){
          return;
        }
        char c=(char)((st.charAt(index)-'1')+'a');//+a for finding the mapped character with int
        helper(st, index+1, s, ch+c);
        if(index+1<=st.length()-1){
            int b=Integer.parseInt(String.valueOf(st.charAt(index)))*10+Integer.parseInt(String.valueOf(st.charAt(index+1)));
            if(b<=26){
                char c5=(char)(b+'a'-1);
                helper(st, index+2, s, ch+c5);
            }
        }
    }
    public static void printEncodings(String str) {
      ArrayList<String>s=new ArrayList<>();
      helper(str, 0, s,"");
	  for (String string : s) {
        System.out.println(string);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}