//Maximum Element in an Array

package arrays;

public class Prob1 {
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,7};
		System.out.println("Max element: "+findMax(arr));
	}
}
