package arrays;

public class Deleting {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for (int i : a) {
            System.out.print(i+" ");
        }
        int index=2;
        for (int i =index; i<a.length-1; i++) {
            a[i]=a[i+1];
           
        }
        
      
        System.out.println();
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
