import java.util.Arrays;
import java.util.HashSet;
class AllArrays{
	static void sortArray(){
		int[] numeric ={1,5,6,8,4,2,3,5,7};
		String[] string={"Vivekanand","Bishwanand","Anand","Vidya","Devanshi","Krishnam"};
		
		for(int j=0;j<numeric.length-1;j++){
			for(int i=0;i<numeric.length-j-1;i++){
			if(numeric[i]>numeric[i+1]){
				int temp=numeric[i];
				numeric[i]=numeric[i+1];
				numeric[i+1]=temp;
			}
		}
	}
	for(int result : numeric){
			System.out.print(result+" ");
		}
		System.out.println();
	for(int j=0;j<string.length-1;j++){
			for(int i=0;i<string.length-j-1;i++){
			if(string[i].compareTo(string[i+1])>0){
				String temp=string[i];
				string[i]=string[i+1];
				string[i+1]=temp;
			}
		}
	}
		for(String result : string){
			System.out.print(result+" ");
		}
	}
	static void sumArrayValues(){
		int[] arr={6,5,2,1,5,3};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.print(sum);
	}
	static void averageValue(){
		int[] arr={5,6,8,4,5,6,9,8};
		int totalElements=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.print(sum/totalElements);
	}
	static void contains(){
		int[] arr={5,3,6,2,1,5,2};
		int desired=1;
		for(int i=0;i<arr.length;i++){
			if(desired==arr[i]){
				System.out.print(i);
				break;
			}
		}
	}
	static void removeValue(){
		int[] arr={1,8,4,2,5,1,36,8};
		int remove=1;
		for(int i=0;i<arr.length;i++){
			if(remove==arr[i]){
				arr[i]=0;
				
			}
		}
		for(int a: arr){
			System.out.print(a+" ");
		}
	}
	static void copyArray(){
		int[] arr={2,5,4,1,6,3,5};
		int[] copyOfArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			copyOfArr[i]=arr[i];
		}
		for(int a: copyOfArr){
			System.out.print(a+" ");
		}
	}
	static void insertElement(int[] nums){
		int newElement=9;
		int[] newArray=new int[nums.length+1];
		int index=4;
		for(int i=0;i<nums.length;i++){
			newArray[i]=nums[i];
		}
		for(int a: newArray){
			System.out.print(a+" ");
			
		}
		System.out.println();
		newArray[index]=newElement;
		for(int i=index;i<nums.length;i++){
			newArray[i+1]=nums[i];
		}
		for(int a: newArray){
			System.out.print(a+" ");
		}
	}
	static void maxMin(int[] nums){
		int max=nums[0];
		int min=nums[0];
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]>max)
				max=nums[i];
		}
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]<min)
				min=nums[i];
		}
		
			System.out.print(max+" "+min);
	}
	static void reverseArray(int[] nums){
		int[] newArray=new int[nums.length];
		int j=0;
		for(int i=nums.length-1;i>=0;i--){
			newArray[j]=nums[i];
			j++;
		}
		for(int i: newArray){
			System.out.print(i+" ");
		}
	}
	static void duplicateValue(int[] nums){
		int duplicate=0;
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
			if((nums[i]==nums[j]) && (i!=j))
				System.out.print(nums[j]+" ");
			}
		}
	}
	static void commonString(String[] string,String[] string2){
		HashSet<String> set=new HashSet<>();
		for(String a: string2){
			set.add(a);
		}
		for(String a: string){
			if(set.contains(a)){
				System.out.println(a);
			}
		}
	}
	static void commonInteger(int[] nums,int[] nums2){
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> printed = new HashSet<>();
		for(int a: nums2){
			set.add(a);
		}
		for(int a:nums){
			if(set.contains(a) && !printed.contains(a)){
				System.out.print(a+" ");
			 printed.add(a);
		}
		}
	}
	static void sLargest(int[] nums){
		Arrays.sort(nums);
		System.out.print(nums[nums.length-2]);
	}
	static void addMatrices(int[][] a,int[][] b){
		int[][] sum = new int[2][2];
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
	}
	}
	public static void main(String[] args){
		 int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
		int[] nums={1,8,4,2,5,1,5,36,8};
		int[] nums2={1,85,65,5,36,2,5,8,9};
		String[] string={"Vivekanand","Bishwanand","Anand","Vidya","Devanshi","Krishnam"};
		String[] string2={"Vivekanand","Bishwanand","Anand","Vidya","Devanshi","Krishnam","Chotku"};
		//sortArray();
		//sumArrayValues();
		//averageValue();
		//contains();
		//removeValue();
		//copyArray();
		//insertElement(nums);
		//maxMin(nums);
		//reverseArray(nums);
		//duplicateValue(nums);
		//commonString(string,string2);
		//commonInteger(nums,nums2);
		//sLargest(nums);
		//addMatrices( a,b);
	}
}