package array;

public class DuplicateElements {
    public static void main(String[] args) {
		int[] arr={10,2,0,6,0,5,0,20,30,2,58};
		int size=arr.length;
	
		for(int i=0;i<size;i++) 
		{
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) 
			{
				if(arr[i]==arr[j]) 
				{
				isDuplicate=true;
				break;
				}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
