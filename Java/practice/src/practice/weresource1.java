package practice;

import java.util.Scanner;

public class weresource1 {
	static void Fibonacci(int n) {
		int num1=0;
		int num2=1;
		int count=0;
		
		while(count<n) {
			System.out.print(num1+ " ");
			int num3;
			num3=num2+num1;
			num1=num2;
			num2=num3;
			count=count+1;
			
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		System.out.println("Fibonacci series: ");
		Fibonacci(n);	
	}
}
