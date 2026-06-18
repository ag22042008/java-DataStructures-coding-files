public class frequencyofeachcharacterinstring {
    public static void main(String[] args) {
            String h="hellounclenamste";
            int []freq=new int[26];
            for(int i=0;i<h.length();i++){
                char c=h.charAt(i);
                int idx=0;
               if(c>='a'&&c<='z'){
                 idx=c-'a';
               }
               freq[idx]++;
            }
            for (int i : freq) {
                System.out.println(i);
            }
            
    }
}
