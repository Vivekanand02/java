package array;

public class IsSorted {
	public static void main(String[] args) {
		int[] arr={10,20,6,5,4,0,5,9};
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int sorted: arr) {
			System.out.print(sorted+" ");
		}
}}
