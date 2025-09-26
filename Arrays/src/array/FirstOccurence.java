package array;

public class FirstOccurence {

	public static void main(String[] args) {
		int[] arr={10,20,6,5,4,0,5,9};
		int size=arr.length;
		int element=5;
		for(int i=0;i<size;i++) {
			if(arr[i]==element) {
				System.out.println("first occurence of " +element +" is "+i);
				break;
			}
		}
		
}
}
