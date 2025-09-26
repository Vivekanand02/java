package logical;

public class NArmstrong {
	static int countNum(int num){
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		return count;
	}
	static int powerNum(int base,int pow){
		int result=1;
	    for(int i=1;i<=pow;i++){
			result*=base;
		}
		return result;
	}
	static boolean armstrong(int num){//153
		int pow=countNum(num);//3
		int temp =num;
		int sum=0;
		while(num!=0) {
			int base=num%10;//3 5  1
			sum= sum+ powerNum(base,pow);//3,3  5,3  1,3
			num/=10;//3  5  1
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		for(int i=1;i<=1000;i++) {
			if(armstrong(i))
				System.out.println(i + " is Armstrong");
		}
		
		
	}

}
