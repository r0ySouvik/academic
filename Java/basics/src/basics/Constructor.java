package basics;

public class Constructor {
	
	String name;
	int age;
	
	
	public Constructor(String n, int a) {
//		name = n ;
//		age = a;
	}
		
	public static void main(String args[]) {
		Constructor obj = new Constructor("Souvik",21);
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);
	}
}
