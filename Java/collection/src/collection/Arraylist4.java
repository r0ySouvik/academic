//Write a java program to copy one array list into another

package collection;
import java.util.*;

public class Arraylist4 {
	public static void main(String[] args) {
		List<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(4);
		arrList1.add(3);
		arrList1.add(2);
		arrList1.add(1);
		
		System.out.println("arrList1: "+arrList1);
		
		List<Integer> arrList2 = new ArrayList<Integer>();
		
		arrList2.add(44);
		arrList2.add(33);
		arrList2.add(22);
		arrList2.add(11);
		
		System.out.println("arrList2: "+arrList2);
		
		//copy arrList1 to arrList2
		Collections.copy(arrList2, arrList1);
		System.out.println("After Copy:---");
		System.out.println("arrList1: "+arrList1);
		System.out.println("arrList2: "+arrList2);
		
	}
}
