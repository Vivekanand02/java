package arrays;

public class ArraysPractice {
    static int isGreater(int [] a){
        int count=0,x=5;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>x) {
                count+=1;
            }
        }System.out.println();

        System.out.print(count);
        return 0;
    }
    static boolean isSorted(int[] a){
        boolean check=true;
        for (int i = 1; i < a.length; i++) {
                if(a[i]<a[i-1]){
                    check=false;
                    break;
                }
            } return check;
        }
       
    
    public static void main(String[] args) {

        //lastIndex=-1;
        int a[]={1,2,3,4,5};
      //  isGreater(a);
      System.out.println("is Sorted :"+isSorted(a));
        
}
}
