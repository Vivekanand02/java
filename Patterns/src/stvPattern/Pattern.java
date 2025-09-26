package stvPattern;

public class Pattern {
	static void squarePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	static void leftRightAngleTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void numericRightAngle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void jNumericRightAngle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void patternFive(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n+1)-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void patternSix(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n+1)-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void patternSeven(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
    	static void patternEight(int n){
    		for(int i=n;i>=1;i--) {
    			for(int j=1;j<=n-i;j++) {
    				System.out.print(" ");
    			}
    			for(int k=1;k<=2*i-1;k++) {
    				System.out.print("*");
    			}
    			for(int j=1;j<=n-i;j++) {
    				System.out.print(" ");
    			}
    			System.out.println();
    		}
	}
    	static void patternNine(int n) {
    		patternSeven(n);
    		patternEight(n);
    	}
    	
	public static void main(String[] args) {
		int n=5;
		//squarePattern(n);
		//leftRightAngleTriangle(n);
		//numericRightAngle(n);
		//jNumericRightAngle(n);
		//patternFive(n);
		//patternSix(n);
		//patternSeven(n);
		//patternEight(n);
		patternNine(n);
	}
}
