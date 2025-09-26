package loop;
public class recursion1 {
    
    public static int calfactorial(int n){
        if(n==1){
            return 1;
        }
        int n1=calfactorial(n-1);
        int n2=n*n1;
        return n2;

    }public static void main(String[] args) {
        int n=5;
       int ans=calfactorial(n);
        System.out.println(ans);

    }
}
