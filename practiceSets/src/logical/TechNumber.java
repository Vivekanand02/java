package logical;

public class TechNumber {
  static void techNum(int num) {
	  int count=CheckArmstrong.countNum(num);
	  int i=1;
	  int firstHalf=0;
	  int secondhalf=0;
	 
	 int pow=CheckArmstrong.powerNum(10,count/2);
	 firstHalf=num/pow;
	 secondhalf=num%pow;
	  int sum=firstHalf+secondhalf;
	  int result=CheckArmstrong.powerNum(sum,2);
	  if(result==num) System.out.println("Tech Number");
	  else System.out.println("Not Tech Number");
  }
  public static void main(String[] args) {
	techNum(20025);
}
}
