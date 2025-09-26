import java.util.Arrays;
public class BubbleSort {
public static void main(String[] args) {
			int arr[]= {6,1,3,2,4,5,8};
			System.out.println(Arrays.toString(arr));
			System.out.println();
			int i=0,count=0;
			
			while(i<arr.length) {
				int j=0;
				while(j<arr.length-i-1) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					System.out.println(Arrays.toString(arr));
					j++;
					count++;
				}
				i++;
				System.out.println();
				}
			System.out.println(count);
			
	}
}
