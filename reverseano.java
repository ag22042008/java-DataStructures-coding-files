import java.util.*;


public class reverseano {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n];
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       if(a[i]==1){
        count1++;
       }
       else if(a[i]==2){
        count2++;
       }
       else if(a[i]==3){
        count3++;
       }
       else count4++;
    }
    int count=0;
    count+=count4;
    count+=count3;
    if(count3>=count1){
      count1=0;
    }
    else if(count3<count1){
      count1=count1-count3;
    }
    if(count2%2==0){
       count+=(count2/2);
       count2=0;
    }
    else{
      count+=(count2/2);
      count2=count2%2;
    }
    if(count2!=0){
       count+=1;
       if(count1<2){
         count1=0;
       }
       else{
        count1-=2;
       }
    }
    count+=Math.ceilDiv(count1, 4);
    System.out.println(count);
  }
}