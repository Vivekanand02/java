package patterns;

public class Cake {
		 public static void main(String[] args) {
			 for(int i=1;i<=3;i++) {
				 for(int j=1;j<=7-i;j++) {
					 System.out.print(" ");
				 }
				 for(int k=1;k<=i;k++) {
					 System.out.print("* ");
				 }
				 System.out.println();
			 }
		for(int i=1;i<=3;i++) {
				for(int j=1;j<=7;j++) {
					if(i==1 || i==3 ||j==1||j==7)
						System.out.print("* ");
					else System.out.print("  ");
			}			
			System.out.println();
			}
		}
}
