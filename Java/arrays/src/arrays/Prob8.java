//Sum of all elements in an array

package arrays;

public class Prob8 {
	public static int findSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
	
	public static void main(String[] args){
        int[] arr = {1,2, 3,4,5};
        System.out.println("Sum of all elements: " +findSum(arr));
    }
}
