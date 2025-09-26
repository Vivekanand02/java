class CopyArray{
	public static void main(String[] args){
		int[] arr={10,3,0,56,85,6};
		int size=arr.length;
		int[] copiedArray=new int[size];
		
		for(int index=0;index<size;index++){
			copiedArray[index]=arr[index];
		}
		for(int a : arr){
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a : copiedArray){
			System.out.print(a+" ");
		}
	}
}