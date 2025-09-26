package array;

public class SwapAlternatePairs {
	public static void swapAlternate(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size-1;i+=2) {
			   
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,4,5,6,7,8,9};
		swapAlternate(arr);
	}
}
