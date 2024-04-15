//Given an array of integers and a value, remove all instances of that value in-place and return the new length of the array

package arrays;

public class Prob6 {
	public static int removeElement(int[] arr, int val){
        int index = 0;
        for(int num : arr){
            if(num != val) {
                arr[index++] = num;
            }
        }
        return index;
    }
	
	public static void main(String[] args){
        int[] arr = {3,2,2,3};
        int val = 3;
        int newLength = removeElement(arr, val);
        System.out.print("New array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
