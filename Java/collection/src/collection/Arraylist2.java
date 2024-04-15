//Write a program to update an array element by the given element 

package collection;
import java.util.*;
public class Arraylist2 {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		
		System.out.println(arrList);
		
		arrList.set(3, 44);
		System.out.println(arrList);
	}
}
