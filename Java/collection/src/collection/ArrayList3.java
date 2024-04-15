//Write a program to sort a given array list

package collection;
import java.util.*;
public class ArrayList3 {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(9);
		arrList.add(6);
		arrList.add(4);
		arrList.add(5);
		
		System.out.println("Before sorting: "+arrList);
		Collections.sort(arrList);
		
		System.out.println("After sorting: "+arrList);
		
		
	}
}
