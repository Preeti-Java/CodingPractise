/**
 * 
 */
package com.learning;

/**
 * 
 */
public class MaxProductFinder {

	 public static void main(String[] args) {
	        int[] nums = {3, 6, -2, -5, 7, 3};
	        int maxProduct = findMaxInlineProduct(nums);
	        int maxRProduct = findMaxRandomProduct(nums);
	        System.out.println("Maximum product of two integers: " + maxRProduct);
	    }

	/**
	 * @param nums
	 * @return
	 */
	private static int findMaxRandomProduct(int[] nums) {
		int maxProduct = Integer.MIN_VALUE;
		int mult = 1;
		for(int i = 0;i<nums.length-1;i++) {
			for(int j= i+1; j < nums.length; j++) {
				mult = nums[i] * nums[j];
				if(mult > maxProduct)
					maxProduct = mult;
			}
		}
		return maxProduct;
	}

	private static int findMaxInlineProduct(int[] nums) {
		int maxProduct = Integer.MIN_VALUE;
		int mult =1;
		for(int i =0; i < nums.length-1;i++) {
			mult = mult * nums[i] * nums[i+1];
			if(mult > maxProduct)
				maxProduct = mult;
			if(mult < maxProduct)
				mult = 1;
			
		}
		return maxProduct;
	}
}
