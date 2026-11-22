import java.util.*;


class second {
    public long MinimumPages(int[] A, int B) {
        long s=0;
        long sum=0;
        if(B>A.length)return -1;
        for (int i : A) {
            sum+=i;
        }
        long e=sum;
        long ans=-1;
        while(s<=e){
            long middle= s+(e-s)/2;
            if(ispossible(A,middle,B)){         // check kre ki itne max panne kya hm kisi config me de pa rhe
               ans=middle;
               e=middle-1; // goal is to minimise the answer

            }
            else{                    // agar itne panne nhi de paye to iska means isse km bhi nhi de paoge kyuki agar panne km to students bd jayenge aur hmare pass ek fix no of students hai
              s=middle+1 ;//kyuki uske neeche fir search krne ka koi logic nhi bnta
            }
        }
        return ans;
    }

    private boolean ispossible(int[] a, long maxpages, int b) {
        int students=1; // start with 1 student frame a config return true if the no of students used is less than or equal total given no of students
        long currpages=0;
        for (int i = 0; i < a.length; i++) {
            if(currpages+a[i]<=maxpages){
                currpages+=a[i]; // checking if we can allocate the pages in acc to the maxpages and frame a configuration
            }
            else{
                if(a[i]>maxpages||students>b)return false; // agar kbhi max pages se jyada hogyi ya students jyada hogye to 
                 students++;
                 currpages=a[i];
            }
        }
        return students<=b;
    }
}

class minpageallocation {
    

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int B = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){A[i] = sc.nextInt();}

        second Obj = new second(); 
        System.out.println(Obj.MinimumPages(A,B));
	}
}