package logical;

public class PalindromeNumber {
	 static void checkNum(int num) {
		int temp=num;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=(rev*10)+rem;
			temp/=10;
		}
		if(rev==num)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	 }
	 static void checkString(String string) {
	int i=string.length()-1;
		 String rev="";
		 while(i>=0) {
			rev=rev+string.charAt(i);
			i--;	
		 }
		 if(rev.equals(string)) {
			 System.out.println("palindrome");
		 }
		 
	 }
	 public static void main(String[] args) {
		checkNum(121);
		checkString("kanaka");
	}
}
