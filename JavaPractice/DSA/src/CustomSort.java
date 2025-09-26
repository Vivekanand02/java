import java.util.Arrays;
public class CustomSort {

	public static void main(String[] args) {
			int arr[]= {9,6,8,2,1,4};
			System.out.println(Arrays.toString(arr));
			System.out.println();
			int i=0,j,temp=0,count=0;
			while(i<arr.length) {
				j=i+1;
				while(j<arr.length) {
					if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
					j++;
					System.out.println(Arrays.toString(arr));
					count++;
				}
				i++;
				System.out.println();
			}
			System.out.println("count :"+count);
	}

}
