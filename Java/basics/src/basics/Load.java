//method overloading

package basics;

class Addition{
	int add(int a , int b) {
		return a+b;
	}
	int add(int a , int b, int c) {
		return a+b+c;
	}
	
}

public class Load {
	public static void main(String args[]) {
		Addition solution = new Addition();
		System.out.println(solution.add(4, 5));
		System.out.println(solution.add(3, 4, 5));		
	}
}
