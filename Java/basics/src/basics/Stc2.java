package basics;

class Car{
	static String engine = "V12";
	int numberOfSeats ;
	String wheelType;
}

public class Stc2 {
	public static void main(String args[]) {
//		Loop loop1 = new Loop();
//		loop1.numbers();
//		loop1.reverse();
		Car bmw = new Car();
		bmw.numberOfSeats = 4;
		Car audi = new Car();
		audi.numberOfSeats = 2;
		//System.out.println(Car.engine);
		System.out.println(bmw.numberOfSeats);
		System.out.println(audi.numberOfSeats);

	}
}
