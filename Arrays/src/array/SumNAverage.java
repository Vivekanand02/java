class SumNAverage{
	public static void main(String[] args){
		int[] arr={7,8,5,6,4,2,13,5};
		int sum=0;
		float avg=0.0f;
		int size=arr.length;
		for(int index=0;index<size;index++){
			sum+=arr[index];
		}
		System.out.println("Sum is :"+sum);
		avg=(float)sum/size;
		System.out.println("Average is :"+avg);
	}
}