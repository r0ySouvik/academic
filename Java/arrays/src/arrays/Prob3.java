//Max element in an array

package arrays;

public class Prob3 {
	public static int findMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max= num;
            }
        }
        return max;
    }
	
	public static void main(String[] args){
        int[] arr = {1,8,3,7,4};
        System.out.println("Maximum element: " +findMax(arr));
    }
}
