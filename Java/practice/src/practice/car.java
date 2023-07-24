package practice;


public class Specs() {
	String color;
	String type;
	
	
}

public class car {
	public static void main(String args[]) {
		Specs obj = new Specs();
		obj.color = "Blue";
		obj.type = "suv";
		System.out.print("obj.color = " + obj.color);
		System.out.print("obj.type= " + obj.type);

	}

}