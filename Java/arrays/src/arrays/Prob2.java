//Reverse the elements of an array

package arrays;

public class Prob2 {
	public static void revArray(int[] arr){
        int left=0;
        int right = arr.length - 1;
        while (left < right) {
            int temp= arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left++;
            right--;
        }
    }
	
	public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        revArray(arr);
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
