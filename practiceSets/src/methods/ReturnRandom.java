package methods;
public class ReturnRandom {
			static int getRandomNumber() {
			int num=(int)(Math.random()*100)+1;
				return num;
		}
	public static void main(String[] args) {
		int result=getRandomNumber();
		System.out.println(result);
	}
	}

