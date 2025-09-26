package arrays;

import java.util.Arrays;

public class SmallestAndLargest {
    static int[] sl( int[] a){
        Arrays.sort(a);
        int ans[]={a[0],a[a.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] ans=SmallestAndLargest.sl(a);
        System.out.println("Smallest :"+ans[0]);
        System.out.print("Largest :"+ans[1]);
    }
}
