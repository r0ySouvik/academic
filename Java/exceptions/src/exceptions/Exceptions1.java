package exceptions;

public class Exceptions1 {
	public static void main(String[] args) {
		try {
			int divide = 2/0;
			System.out.println(divide);
		} 
		catch(ArithmeticException e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}
}
