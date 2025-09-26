class Sorting{
static void selectionSort(int[] arr){
	int n=arr.length;
	for(int i=0;i<n-1;i++){
		int minm=i;
		for(int j=i+1;j<n;j++){
			if(arr[j]<arr[minm]){
				minm=j;
			}
			
		}
		int temp=arr[i];
			arr[i]=arr[minm];
			arr[minm]=temp;
	}
	for(int a: arr){
		System.out.print(a+" ");
	}
}
public static void main(String[] args) {
	int[] arr={5,7,1,2,6,4,9,8};
	selectionSort(arr);
}
}