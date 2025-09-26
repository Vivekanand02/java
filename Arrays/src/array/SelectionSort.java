package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={98,56,75,12,34,62};
        int min,temp=0;
        for (int i = 0; i < a.length; i++) {
            min=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min]) {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
