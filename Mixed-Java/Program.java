import java.util.Arrays;
class Program{
	public static void main(String[] args){
		//int[] arr={12,20,5,2,1,6,3,4,2,1,12};
		String[] arr={"red","green","black","yellow"};
		String[] arr2={"white","green","violet","black"};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i].equals(arr2[j])){
					System.out.println("We found the duplicate element at "+j+" "+arr[j]);
				}
			}
		}
		
		}
}