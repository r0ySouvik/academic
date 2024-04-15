//method overriding

package basics;

class Vehicle{
	void move() {
		System.out.println("A vehicle moves");
	}
}
class Car extends Vehicle{
	void move() {
		System.out.println("Car moves on four wheels");
	}
}
class Bike extends Vehicle{
	void move() {
		System.out.println("Bike moves on two wheels");
	}
}

public class Ride {
	public static void main(String args[]) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.move();
		bike.move();
	}
}
