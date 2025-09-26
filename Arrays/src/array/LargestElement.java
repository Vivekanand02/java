package array;

public class LargestElement {
	public static void main(String[] args) {
			int[] arr= {10,20,6,5,4,0,5,9};
			int size=arr.length;
			int max =arr[0];
			
			for(int i=0; i<size;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			System.out.println(max);
	}
}
