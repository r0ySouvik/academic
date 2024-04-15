//Selection Sort algorithm to sort an array of integers in ascending order

package sorting;

public class Sort2{
	public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n - 1;i++){
            int minIndex = i;
            for(int j =i+1;j < n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void main(String[] args) {
        int[] arr ={13,27,8,2,21,45,23};
        selectionSort(arr);
        System.out.print("Sorted array: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}
