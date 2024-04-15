//Min element in an array

package arrays;

public class Prob4 {
	public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
	
	public static void main(String[] args){
        int[] arr = {53,19,12,3,7};
        System.out.println("Minimum element: " +findMin(arr));
    }
}
