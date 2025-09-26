import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {4,1,2,7,9,6};
		int i=0;
		while(i<arr.length-1) {
			int min=i;
			int j=i+1;
			while(j<arr.length) {
				if(arr[min]>arr[j])
					min=j;
				j++;
				
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			i++;
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void Swap(int a, int min, int i) {
		// TODO Auto-generated method stub
		
	}
}
