class SortArray{
	public static void main(String[] args){
		int[] arr={4,2,6,3,5,19,8,7};
		int size=arr.length;
		for(int outer=0;outer<size;outer++){
		for(int inner=outer+1;inner<size;inner++){
			if(arr[outer]>arr[inner]){
				int temp=arr[outer];
				arr[outer]=arr[inner];
				arr[inner]=temp;
			}
		}
		}
		for(int sortedArray : arr){
			System.out.print(sortedArray+" ");
		}
	}
}