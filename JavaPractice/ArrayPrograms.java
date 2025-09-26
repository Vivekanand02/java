import java.util.Scanner;
class ArrayPrograms{
	public static void sortNumeric(){
		int[] numeric={6,8,1,4,3,5};
		for(int i=0;i<numeric.length-1;i++){
			for(int j=0;j<numeric.length-1-i;j++){
			int temp;
			if(numeric[j]>numeric[j+1]){
				temp=numeric[j];
				numeric[j]=numeric[j+1];
				numeric[j+1]=temp;
				}
	    	}
		}
			for(int a:numeric){
			System.out.print(a+" ");
			}
		 }	
		 

 public static void main(String[] args){
	sortNumeric();
 
}
}