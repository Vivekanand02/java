public class VowelConsonantCheck {
    public static void main(String[] args) {
      char ch='A';
	  if(ch>='A' && ch<='Z')
	  {
		  ch=(char)(ch+32);
	  }
	  if(ch>='a' && ch<='z')
	  {
		  if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
		  {
			  System.out.println("Vowel");
		  }
		  else
		  {
			  System.out.println("Consonent");
		  }
	  }
		   else
		   {
		  System.out.println("! an alphabet character");
		   }
	   
}
