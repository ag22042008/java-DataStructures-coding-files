public class stringsreplace {
    public static void main(String[] args) {
        String t1="Iamajavaprogrammer";
        char t2='v';
        String j="";
        //o(n2)complexity;
        for (int i = 0; i < t1.length(); i++) {
            if(t1.charAt(i)=='a'){
              j+='v';
            }
            else{
                j+=t1.charAt(i);
            }
        }
        System.out.println(j);
    }
}
