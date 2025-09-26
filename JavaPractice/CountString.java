import java.util.*;
class CountString{
	static int count1,count2;
	public static void main(String[] args){
		String str="he*l##l*0**#";
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='*'){
				count1++;
			}
			else if(str.charAt(i)=='#'){
				 count2++;
			}
		}
		System.out.print("* :"+count1+" "+"# :"+count2);
		
		
	}
}
/*
if(count1>count2)
			System.out.print("* has more counts than #");
		else if(count1==count2)
			System.out.print("Perfect string...");
		else 
			System.out.print("# has more counts than *");
*/