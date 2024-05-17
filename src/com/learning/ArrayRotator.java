/**
 * 
 */
package com.learning;

import java.util.Arrays;

/**
 * 
 */
public class ArrayRotator {

	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        
        rotateArray(nums, k);
        
        System.out.println("Array after rotating by " + k + " positions to the right: " + Arrays.toString(nums));
    }

	private static void rotateArray(int[] nums, int k) {
            int n = nums.length;
            k = k%n;
            reverse(nums, 0, n-1);
            reverse(nums, 0,k-1);
            reverse(nums, k,n-1);
            
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start ++;
			end --;
		}
	}
}
