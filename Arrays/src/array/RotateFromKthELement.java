package array;

public class RotateFromKthELement {
   public static void main(String[] args) {
	int[] arr= {1,3,6,5,4,6,2};
	int size=arr.length;
     int index=3;
     for(int original : arr) {
    	 System.out.print(original+" ");
     }
     System.out.println();
     for(int i=0;i<size/index;i++) {
    	 int temp=arr[i];
    	 arr[i]=arr[size-index-i];
    	 arr[size-1-i]=temp;
     }
     for(int rotatedArr : arr) {
    	 System.out.print(rotatedArr+" ");
     }
}
}
