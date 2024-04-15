package basics;

class Add{
	static int sum(int a,int b) {
		return a*b;
	}
}

public class Stc {
	public static void main(String args[]) {
		int sol = Add.sum(5, 2);
		System.out.println("The added values are: " +sol);
	}
}
