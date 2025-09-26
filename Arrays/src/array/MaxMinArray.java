class MaxMinArray{
	public static void main(String[] args){
		int[] arr={5,2,3,6,1,4,5};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++){
		if(arr[i]>max)
			max=arr[i];
		else if(arr[i]<min)
		   min=arr[i];
	}
	System.out.println(max);
	System.out.println(min);
}
}
