/**
 * 
 */
package com.learning;

import java.util.Arrays;

/**
 * 
 */
public class SecondLargestElementFinder {

	public static void main(String[] args) {
        int[] nums = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        int secondLargest = findSecondLargest(nums);
        System.out.println("Second largest element in the array: " + secondLargest);
    }

	private static int findSecondLargest(int[] nums) {
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		Arrays.sort(nums);
		for(int i = 0;i <  nums.length; i++) {
			if(largest < nums[i])
			{
				seclargest = largest;
				largest = nums[i];
				
			}
		}
		return seclargest;
	}
	
	
}
