package practice;

import java.util.Scanner;

public class evenSum {
	
	static int addEven(int arr[],int arrLength,int i) {
		
		if(i>=arrLength)
			return 0;
		
		int currentElement = arr[i];
		int sum=0;
		
		if(arr[i]%2==0) {
			sum =currentElement;
		}
		return sum + addEven(arr,arrLength,i+1);	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		int firstIndex = 0;
		int total = addEven(a,size,firstIndex);
		System.out.println("The sum of even numbers: " +total);
	}
}
