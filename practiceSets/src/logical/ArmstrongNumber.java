package logical;

public class ArmstrongNumber {
	static void checkArmstrong(int num) {
		int sum=0;
		int temp=num;
		int count=0;
		while(temp!=0) {
			count++;
						
			temp/=10;
		}
		temp=num;
			while (temp!=0) {
				int rem=temp%10;
				int power=1;
				for(int i=1;i<=count;i++) {
					power*=rem;
				}
				sum+=power;
				temp/=10;
			}
			if(sum==num) {
				System.out.println("Armstrong");
			}
		}
	public static void main(String[] args) {
		checkArmstrong(153);
	}
	}
	

