class CountEvenAndOdd{
	public static void main(String[] args){
		int[] arr={5,6,2,1,4,5,23,7};
		int countOdd=0;
		int countEven=0;
		int size=arr.length;
		for(int index=0;index<size;index++){
			if(arr[index]%2==0) countEven++;
			else countOdd++;
		}
		System.out.println("Even are : "+countEven);
		System.out.println("Odd are : "+countOdd);
	}
}