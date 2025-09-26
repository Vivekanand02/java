package logical;

public class CheckFactorial {
	static int facto=1;
//  static int checkFactorial(int num) {
//	  if(num==0 || num==1) {
//		  return 1;
//	  }
//	  return num*checkFactorial(--num);
//  }
  public static void main(String[] args) {
//	System.out.println(checkFactorial(5));
	 int num=5;
	 for(int i=1;i<=num;i++) {
		 facto*=i;
		
	 }
	 System.out.println(facto);
}
}
