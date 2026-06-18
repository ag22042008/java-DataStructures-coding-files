public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder k=new StringBuilder("Aditya");
        k.append(" weds dsa");
        System.out.println(k);
        //0(1) operation
        k.insert(0, 'g');//0(n) operation
        System.out.println(k);
        System.out.println(k.toString());
        Integer.parseInt("234");
    }
}
