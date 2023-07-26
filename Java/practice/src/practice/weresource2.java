package practice;
import java.util.Scanner;

public class weresource2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		System.out.println("Enter fourth number: ");
		int d = sc.nextInt();
		
		if(a==b && b==c && c==d) {
			System.out.println("ALl four numbers are equal");
		}
		else {
			System.out.println("All four numbers are not equal ");
		}
				
	}
}
