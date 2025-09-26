class PalindromeArray{
	public static void main(String[] args){
		int[] arr={1,2,3,2,1};
		int size=arr.length;
		boolean flag=true;
		
		for(int i=0;i<size/2;i++){
		    if(arr[i]!=arr[size-1-i]){
			flag = false;
		break;
			}
		}
		if(flag)
			System.out.print("Palindrome");
		else System.out.println("Not Palindrome");
		
		
	}
}