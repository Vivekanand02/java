class RemoveDArray{
	public static void main(String[] args){
		int[] original={5,4,2,1,6,3,5,1,2,4};
		int size=original.length;
		for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(original[i]==original[j])
				original[j]=Integer.MIN_VALUE;
		}
	   }
	   for(int removedDuplicate:original){
		   System.out.print(removedDuplicate+" ");
	   }
	}
}