/**
 * 
 */
package com.learning;

/**
 * 
 */
public class SortedArrayDuplicateRemover {

	 public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
	        int newSize = removeDuplicates(nums);
	        
	        System.out.println("New size of array after removing duplicates: " + newSize);
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < newSize; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }

	private static int removeDuplicates(int[] nums) {
		int len =  nums.length;
		int index = 1;
		for(int i = 1;i < len;i++) {
			if(nums[i] != nums[i-1]) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}
}
