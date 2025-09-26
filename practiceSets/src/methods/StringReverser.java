package methods;

public class StringReverser {
     static String stringReverser(String s) {
    	 String reversed="";
    	 for(int i=s.length()-1;i>=0;i--) {
    		 reversed+=s.charAt(i);
    	 }
    	 return reversed;
     }
     public static void main(String[] args) {
		String original="Vivekanand";
		String result=stringReverser(original);
		System.out.println(result);
	}
}
