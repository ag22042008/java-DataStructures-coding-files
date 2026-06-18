public class s{
    public static void main(String[] args) {
             for(int i=0;i<4;i++){
                for(int j=0;j<5;j++){
                    System.out.print("1");
                }
                System.out.println();
             }
             for (int i = 0; i <5; i++) {

                for(int j=5-i;j>0;j--){
                     System.out.print("*");
                }
                System.out.println();

             }
             for (int i = 1; i <=4; i++) {
                for(int j=0;j<i;j++){
                    System.out.print('a');
                }
                System.out.println();
                
             }
             for (int i = 1; i <=4; i++) {
                
             for(int j=0;j<i;j++){
                System.out.print((char)('a'+j));
             }
             System.out.println();
             }
              for (int i = 0; i <4; i++) {
                char D='A';
             for(int j=4;j-i>0;j--){
                System.out.print(D);
                 D++;

             }
             System.out.println();
             }
            
   }
}