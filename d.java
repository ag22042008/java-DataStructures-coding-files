import java.util.*;

public class d {
  public static void addedge(boolean[][]matrix,int u,int v,boolean isbidirec){
      matrix[u][v]=true;
      if(isbidirec){
        matrix[v][u]=true;
      }

  }
    public static void main(String[] args) {
        
        int v=4;
        boolean[][]s=new boolean[v+1][v+1];
        addedge(s,1,2,false)  ;
        addedge(s, 2,3, false);   
        int n=s[0].length;
          
           
      }
  
        
    
  }

