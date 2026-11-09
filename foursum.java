import java.util.*;
import java.io.*;
class Solution1309 {
   public List<List<Integer>> fourSum222(int[] nums, int target) {
      List<List<Integer>>as=new ArrayList<>();
      Arrays.sort(nums);
      for (int i = 0; i < nums.length; i++) {
        if(i>0&&nums[i]==nums[i-1])continue;
         for(int j=i+1;j<nums.length;j++){
             if(j>i+1&&nums[j]==nums[j-1])continue;// pehla iteration chlega or duplicates skip krne pdega prev agar duplicates
             int k=j+1;
             int end=nums.length-1;
             while(k<end){
                int sum=nums[i]+nums[j]+nums[k]+nums[end];
                if(sum==target){
                    as.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[end])));
                    while(k<end&&nums[k]==nums[k+1])k++;
                    while(k<end&&nums[end]==nums[end-1])end--;
                    k++;
                    end--; // means if we donot get duplicates then we have to go further after we gwt answer
                }
                else if(sum>target){
                    end--;
                }
                else{
                    k++;
                }
             }
         }
        
      }
       return as;
   }
}

public class foursum
{
	    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution1309 Obj = new Solution1309();
        List<List<Integer>> res = Obj.fourSum222(nums, k);

      
        for(int i= 0; i<res.size(); i++){
           Collections.sort(res.get(i));
        }

     
        Collections.sort(res, new Comparator<List<Integer>>() {
               public int compare(List<Integer> frst, List<Integer> scnd) {
                    int i=0;
                    while(frst.get(i)==scnd.get(i)) i++;
                    return frst.get(i)-scnd.get(i);
                    }
                });

        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}
