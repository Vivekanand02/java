package methods;

public class RecursionFactorial {
	static int facto=1;
	static int factorialRecursive(int n) {
		if(n>0) 
		{
		facto*=n;
		n--;
		factorialRecursive(n);
		}
		return facto;
	}
		public static void main(String[] args) {
		int result=	factorialRecursive(5);
		System.out.println(result);
		}
}
