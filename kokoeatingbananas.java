import java.util.Scanner;

import java.util.*;

class jobmarket {
    public static  boolean ispossible(int[]b,int speed ,int h){
        long hours=0;
        for(int i=0;i<b.length;i++){
            if(b[i]<=speed){
                hours+=1;
            }
            else{
               hours+=Math.ceil((double)b[i]/speed);
            }
        }
        return hours<=h;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(s<=e){
            int middle=s+(e-s)/2;
            if(ispossible(piles,middle,h)){
                ans=middle;
                e=middle-1;
            }
            else{
                s=middle+1;
            }
        }
        return ans;
        }
}

public class kokoeatingbananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        System.out.println(jobmarket.minEatingSpeed(array, h));
        scanner.close();
    }
}

