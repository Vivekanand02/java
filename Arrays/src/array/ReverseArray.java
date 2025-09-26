class ReverseArray{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9};
		int size=arr.length;
		for(int original : arr){
				System.out.print(original +" ");
			}
			for(int inner=0;inner<size/2;inner++){
				
					int temp=arr[inner];
					arr[inner]=arr[size-1-inner];
					arr[size-1-inner]=temp;
				
			}
			
			System.out.println();
			for(int reversed : arr){
				System.out.print(reversed+" ");
			}
	}
}