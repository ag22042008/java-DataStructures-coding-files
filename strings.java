public class strings{
    public static void main(String[] args) {
        
        String a="ABc";
        String b="abc";
        
        String a1="Hello";
        String b1="hello";
        String h="ho";//constant pool case
        String r="ho";//constant pool case
        System.out.println(h==r);
        String h1=new String("ho");//original heap allocation
        String r1=new String("ho");//original heap allocation
        System.out.println(h1==r1);//original heap allocation
        //first index logic
        String s="helloe";
        char f='e';
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==f){
                System.out.println(i);
                break;
            }
        }
        //last index logic
        int index=0;
       for(int i=0;i<n;i++){
            if(s.charAt(i)==f){
                index=i;
            }
        }
         
        System.out.println(index);
        String f1="acciojob";
        System.out.println(f1.substring(1, 4));//o(n)complexity // ek index bda ke do for ending as it takes previous before 1 index
        String f2=" IAmAJavaProgrammer";
        // contains function logic
        // String k="cci";
        // boolean h4=false;
        // for (int i = 0; i <f1.length(); i++) {
        //     String h2="";
            
        //      for(int j = i;j<f1.length();j++){
        //          h2+=f1.charAt(j);
        //          if(h2.equals(k)){
        //             System.out.println("present");
        //             h4=true;
        //             break;
        //          }
                
        //      }
        //       if(h4){
        //             break;
        //      }
        // }
     
    //  if(!h4){
    //    System.out.println("Not present");
    //  }
  
}
}