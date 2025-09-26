package array;

public class SumOfElements {
public static void main(String[] args) {
	int[] arr={10,20,6,5,4,0,5,9};
	int size=arr.length;
	
	int sum=0;
	for(int i=0;i<size;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
