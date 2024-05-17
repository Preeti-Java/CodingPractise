/**
 * 
 */
package com.learning;

/**
 * Java program to reverse the order of words in a given string:

 */
public class ReverseWords {

	public static void main(String[] args) {
        String input = "Hello world! This is a test.";
        String reversed = reverseWords(input);
        System.out.println("Reversed String: " + reversed);
    }
	public static String reverseWords(String str) {
		
		//1.
	
		/**	StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();  */
		   
		StringBuffer sb = new StringBuffer();
			char[] c = str.toCharArray();
			for(int i = c.length-1;i>=0;i--) {
				sb.append(c[i]);
			}
			return sb.toString();
	}
}
