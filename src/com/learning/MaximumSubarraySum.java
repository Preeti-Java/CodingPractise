/**
 * 
 */
package com.learning;

/**
 * 
 */
public class MaximumSubarraySum {

	public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

	private static int findMaxSubarraySum(int[] nums) {
		
		int maxSubArraySum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i =0;i < nums.length;i++) {
			sum = sum + nums[i];
			if(sum > maxSubArraySum)
				maxSubArraySum = sum;
			if (sum < 0) {
	            sum = 0; // Reset sum to 0 if it becomes negative
	        }
		}
		
		return maxSubArraySum;
	}
}
