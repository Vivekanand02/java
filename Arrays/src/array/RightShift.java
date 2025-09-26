package arrays;

public class RightShift {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int temp=a[a.length-1];
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a.length-1; i>0;i--) {
            a[i]=a[i-1];
        }
        a[0]=temp;
        for (int i : a) {
            System.out.print(i+" ");
        }
       
    }
}
/*//Inserting element in an array
        // int a[]=new int[10];
        // a[0]=1;
        // a[1]=3;
        // a[2]=8;
        // a[3]=7;
        // a[4]=9;
        // a[5]=6;
        // int n=6;
        // for (int i = 0; i <n; i++) {
        //     System.out.print(a[i]+" ");
            
        // }
        // System.out.println("");
        // int x=21;
        // int index=2;
        // for (int i = n; i>index; i--) {
        //     a[i]=a[i-1];
            
        // }a[index]=x;
        // for (int i = 0; i <n; i++) {
        //     System.out.print(a[i]+" ");
        // } */
