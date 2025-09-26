class CountElements{
public static void main(String[] args){
		int[] arr={5,8,1,3,9,6};
		int maxElement=arr[0];
		int maxValue=1;
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>maxElement){
				maxValue++;
			maxElement=arr[i];
		}
		}
		System.out.println(maxValue);
		
		}
	}