package array;

import java.util.Arrays;

public class SecondElementOptimized {
		public static int secondLargest(int[] arr) {
		int size=arr.length;
		Arrays.sort(arr);
		for(int i=size-1;i>=0;i--) {
			if(arr[i]!=arr[i-1])
			   return arr[size-2];
		}
		return Integer.MIN_VALUE;
		}
		public static void main(String[] args) {
			int[] arr= {10,9,8,7,6,5,4,3,2,1};
			System.out.println(secondLargest(arr));
		}
}
