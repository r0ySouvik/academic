//Check if an array consists an specific element

package arrays;

public class Prob9 {
	public static boolean containsElement(int[] arr,int target) {
        for(int num : arr){
            if(num == target){
                return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target= 7;
        System.out.println("Array contains " + target + ": " +containsElement(arr,target));
    }
}
