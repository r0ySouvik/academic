//create a method that takes an integer as parameter and throws an exception if the nunmber is odd

package exceptions;

public class Exceptions2 {
	public static void main(String[] args) {
		int num = 10;
		checkNum(num);
	}
	
	public static void checkNum(int n) {
		try {
			evenCheck(n);
			System.out.println(n+ "is even");
		}
		catch(OddNumberException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
	public static void evenCheck(int num) {
		if(num % 2 != 0) {
			throw new OddNumberException(num + "is odd");
		}
	}
}

class OddNumberException extends Exception{
	public OddNumberException(String message) {
		super(message);
	}
}
