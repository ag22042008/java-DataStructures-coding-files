import java.util.*;

public class targetsubset {
    public static void helpersubsets(int[]arr,int target,int idx,ArrayList<ArrayList<Integer>>s,ArrayList<Integer>a ){
        if(target==0){
            s.add(new ArrayList<>(a));
            return;
        }
        if(idx>=arr.length||target<0){
            return;
        }
        a.add(arr[idx]);
        helpersubsets(arr,target-arr[idx],idx+1,s,a);
        a.remove(a.size()-1);
        helpersubsets(arr,target,idx+1,s,a);
    }
    public static ArrayList<ArrayList<Integer>> findSubsets(int[] arr, int tar) {
        ArrayList<ArrayList<Integer>>s =new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        helpersubsets(arr,tar,0,s,a);
        return s;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        ArrayList<ArrayList<Integer>> subsets = findSubsets(arr, tar);

        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        if (subsets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (ArrayList<Integer> list : subsets) {
                for (int x : list) System.out.print(x + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}