import java.io.*;
import java.util.*;
import java.util.*;

class Solve12{

    public int aggressiveCows2(int a[],int cows){
       int []b=a.clone();
       Arrays.sort(b);
        int  s=1;
       int e=b[b.length-1]-b[0];// max distance ever possible 
       int ans=0;
       while(s<=e){
         int middle=s+(e-s)/2;
         if(ispossible(a,middle,cows)){
            ans=middle;
            s=middle+1;
         }
         else{
            e=middle-1;
         }
       }
       return ans;
       
    }

    private static boolean ispossible(int[] a, int mindist, int cows) {
        int cowsplaced=1;// we place first cow on the first place 
        int lastplaced=0;//first cow on the first place 
        for(int i=1;i<a.length;i++){
           if(a[i]-a[lastplaced]>=mindist){  //atleast the smallest and can be greater or hmesa last wli cow se min distance check kroge
              cowsplaced++;
              lastplaced=i;
           }
        }
        return cowsplaced>=cows;
    }


}

class aggressivecows13{
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solve12 obj=new Solve12();
		System.out.println(obj.aggressiveCows2(nums,k));

    }
}

