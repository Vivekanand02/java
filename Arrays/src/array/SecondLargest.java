class SecondLargest{

static int secondLar(int arr[]){
int largest = 0;
int res= -1;
for(int i=0;i<arr.length;i++){
   if(arr[i] >arr[largest]){
    res = largest;
	largest =i;
	}
	if(arr[i] != arr[largest]){
	if(res==-1 || arr[i]>arr[res]){
	 res=i;
	 }
	 }
}
return res;
}
	 public static void main(String [] args){
	 
	 int arr[] = {9,9,9,9,9,9,8};
	 if(secondLar(arr)==-1){
	 System.out.println("Element not found");
	 }
	 else{
	 System.out.println(arr[secondLar(arr)]);
	 }
	 
	 }
	 }