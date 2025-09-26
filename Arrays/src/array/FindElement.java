class FindElement{
	public static void main(String[] args){
		int[] arr={5,6,2,3,4,1,15,9,87,5,1,2};
		int element=88;
		int size=arr.length;
		boolean found=false;
		for(int index=0;index<size;index++){
			if(arr[index]==element) {
				System.out.println("Element found in index no : "+index);
				found=true;
			}
		}
		if(!found){
			System.out.println("ELement is not found in the array.");
		}
	}
}