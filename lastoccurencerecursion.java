import java.util.Scanner;



class lastoccurencerecursion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, 0));
	}

	static int lastIndex(int A[],int T,int startIndex)
	{
        if(startIndex>=A.length)return -1;
        int x=lastIndex(A, T, startIndex+1);
		if(A[startIndex]==T){
            return Math.max(startIndex, x);
        }
        return x;
	}
}
