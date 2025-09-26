package arrays;

public class ArrayPractice2 {
    
    static void repeat(int[] a){
        int target=5;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target){
                    count++;
            }
        }System.out.print(count);
    }
    static int lastOccurence(int[] a){
        int target=5;
    //    int count;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>target){
                   
                    System.out.print(a[i]);
                    
            }
           }
           return 0;
    }
     public static void main(String[] args) {
        int[] a={5,4,5,5,3,6,5,5,7};
       // repeat(a);
        System.out.println(lastOccurence(a));
        
    }
}
