package arrays;

public class Inserting {
    public static void main(String[] args) {
        int[] a=new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
       int n=5;
        for (int i : a) {
            System.out.print(i+" ");
        }
        int x=6;
        int index=2;
        for (int i =n; i>index; i--) {
            a[i]=a[i-1];
        }
        
        a[index]=x;
        System.out.println();
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
