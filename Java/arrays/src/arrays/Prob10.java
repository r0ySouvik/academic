//Given an array containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

package arrays;

public class Prob10 {
	public int findMissingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Prob10 solution = new Prob10();
        int[] nums = {2,0,1};
        System.out.println("Missing number: " +solution.findMissingNumber(nums));
    }
}
