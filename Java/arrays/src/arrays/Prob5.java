//Check if array is sorted

package arrays;

public class Prob5 {
	public static boolean isSorted(int[] arr){
        for(int i=1;i < arr.length;i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,2,4,5};
        System.out.println("Arr1 sorted: " +isSorted(arr1));
        System.out.println("Arr2 sorted: " + isSorted(arr2));
    }
}
