package practice;

import java.util.Scanner;

public class factorial_rec {
	static int factorial(int n) {
		if(n!=0) {
			return n*factorial(n-1);
		}
		else 
			return 1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for factorial: ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(num+ " Factorial =" +result);
	}

}
