package practice;

import java.util.Scanner;

public class multiply {
	public static int Calculate(int a, int b) {
		int result= a*b;
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int product = Calculate(a,b);
		System.out.println("Product of the two nums are: "+product);
	}
}
