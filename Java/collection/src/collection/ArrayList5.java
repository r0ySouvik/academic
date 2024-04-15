//Write a program to reverse elements in an array list

package collection;
import java.util.*;

public class ArrayList5 {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(4);
		arrList.add(3);
		arrList.add(2);
		arrList.add(1);
		
		System.out.println("Before reverse: "+arrList);
		Collections.reverse(arrList);
		System.out.println("After reverse: "+arrList);
		
	}
}
