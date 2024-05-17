/**
 * 
 */
package com.learning;

import java.util.Arrays;

/**
 * 
 */
public class EvenOddRearranger {

	public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        rearrangeEvenOdd(array);
        System.out.println("Rearranged Array: " + Arrays.toString(array));
    }
	
	public static int[] rearrangeEvenOdd(int[] array) {
		int length = array.length;
		
		int left = 0;
		int right = length-1;
		
		while(left < right) {
			
			//for odd
		   while(array[left] % 2 == 0 && left <right) { // 4
			   left++;                                  // 2
		   }
		   
		   //for even
		   while(array[right] % 2 != 0 && left <right) { //5 
			   right--;                                  //10
		   }
		   
		   if(left < right) {
			   int temp = array[left];  
			   array[left] = array[right];
			   array[right] = temp;
		   } // {3,1,5,    4}
		   
		   
		}
		
		return array;
		
	}
}
