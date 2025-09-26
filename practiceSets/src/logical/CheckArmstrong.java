package logical;
public class CheckArmstrong {
	public static int countNum(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	public static int powerNum(int base,int pow) {
		int result=1;
		int i=1;
		while(i<=pow) {
			result*=base;
			i++;
		}
		
		return result;
	}
	public static void checkArmstrong(int num) {
		int pow=countNum(num);
		int sum=0;
		int temp=num;
		while(num!=0) {
			int base=num%10;
			 sum=sum + powerNum(base,pow);
			num/=10;
		}
		if(temp==sum) System.out.println(sum);
			
		
	}
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++) {
		checkArmstrong(i);
		}
		System.out.println();
		System.out.println(powerNum(5,3));
		System.out.println(countNum(5421));
		
	}
}
