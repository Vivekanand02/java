class HomeWork2{
static void sum(){
	int num1=10;
	int num2=20;
	int sum=num1+num2;
	System.out.println(sum);
}
static void decimalSum(){
	float num1=10.5f;
	float num2=20.4f;
	float sum=num1+num2;
	System.out.println(sum);
}
static void printName()
{
	int n=5;
	while(n>0){
		System.out.println("Vivekanand");
		n--;
	}
}
static void dayNumber(){
	int num=5;
	switch(num){
		case 1 :System.out.println("Sunday");
		break;
		case 2 :System.out.println("Monday");
		break;
		case 3 :System.out.println("Tuesday");
		break;
		case 4 :System.out.println("Wednesday");
		break;
		case 5 :System.out.println("Thursday");
		break;
		case 6 :System.out.println("Friday");
		break;
		case 7 :System.out.println("Saturday");
		break;
	}
}
 static void largest(int num1,int num2){
	 System.out.println(num1>num2);
	 System.out.println(num2>num2);
 }
public static void main(String[] args){
	sum();
	decimalSum();
	printName();
	dayNumber();
	largest();
}
}
