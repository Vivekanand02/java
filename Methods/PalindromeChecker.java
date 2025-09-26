package methods;

public class PalindromeChecker {
	      static String reverse="";
		static void isPalindrome(String s) {
			for(int i=s.length()-1;i>=0;i--) {
			 reverse+=s.charAt(i);
			}
		if(reverse.equals(s))System.out.println("palindrome");
		else System.out.println("!palindrome");
		}
		public static void main(String[] args) {
			isPalindrome("kanak");
		}
}
