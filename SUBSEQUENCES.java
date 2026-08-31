public class SUBSEQUENCES{
    static void helper(String f,int index,String ans){
        if(index>=f.length()){
            System.out.print(ans+" ");
            return;
        }
        // take us character ko utha liya to use ans me append krdi
        helper(f,index+1,ans+f.charAt(index));
        //Not take us character ko nhi uthaya 
        helper(f,index+1,ans);
    }
    static void printSubsequence(String s) {
        helper(s,0,"");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}