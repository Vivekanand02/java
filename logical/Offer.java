package logical;

import java.util.Arrays;
import java.util.Scanner;

public class Offer {
	static void price(int[] arr) {
		Arrays.sort(arr);
		double discount=arr[0]*60/100;
		double firstPrice=arr[0]-discount;
		System.out.println(arr[2]+firstPrice);
	}
	static void price(double[] arr2) {
		Arrays.sort(arr2);
		System.out.println(arr2[1]);
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt(); 
	int[] arr= {a,b,c};
	price(arr);
	double[] arr2= {a,b};
	price(arr2);
}
}
