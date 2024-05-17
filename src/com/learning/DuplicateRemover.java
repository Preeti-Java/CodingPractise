/**
 * 
 */
package com.learning;

/**
 * 
 */
public class DuplicateRemover {

	public static void main(String[] args) {
        String str = "hello";
        String result = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

	private static String removeDuplicates(String str1) {
		char[] charArr = str1.toCharArray();
		for(int j = 0; j < charArr.length; j++) {
			char c= charArr[j];
			if(c != 0) {
			for(int  i =j+1;i < charArr.length;i++) {
				if(c == charArr[i])
					charArr[i] = 0;
			}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(char c : charArr)
			if(c !=0)
		   sb.append(c);
		
		return sb.toString();
		
	
	}
}
