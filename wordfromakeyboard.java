import java.io.*;

import java.util.*;

import javax.print.DocFlavor.STRING;



public class wordfromakeyboard{



    static ArrayList<String> getStrings(ArrayList<String> arr)

    {  
      ArrayList<String>s=new ArrayList<>();
      String g="qwertyuiop";
      String h="asdfghjkl";
      String w="zxcvbnm";
      for (int i = 0; i < arr.size(); i++) {
         String a=arr.get(i);
         char l=arr.get(i).charAt(0);
         boolean f=true;
         if(g.contains(String.valueOf(l))){
            for(int j=1;j<a.length();j++){
               if(!g.contains(String.valueOf(a.charAt(j)))){
                 f=false;
                 break;
               }
            }
           
            if(f){
                s.add(a);
            }
            
         }
         else if(h.contains(String.valueOf(l))){
           
            for(int j=1;j<a.length();j++){
               if(!h.contains(String.valueOf(a.charAt(j)))){
                 f=false;
                 break;
               }
            }
            
            if(f){
                s.add(a);
            }
         }
         else{
           
            for(int j=1;j<a.length();j++){
               if(!w.contains(String.valueOf(a.charAt(j)))){
                 f=false;
                 break;
               }
            }
            
            if(f){
                s.add(a);
            }
         }

      }
       return s;
       
        
    }



    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

    

        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<String>();

        for(int i = 0; i < n; i++){

            String s = sc.next();

            arr.add(s);


        }



        ArrayList<String> result = getStrings(arr);

        for(int i = 0; i < result.size(); i++){

            System.out.println(result.get(i));

        }

    }

}
