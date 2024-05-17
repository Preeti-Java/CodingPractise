/**
 * 
 */
package com.learning;

/**
 * 
 */
public class StringCompressor {

	public static void main(String[] args) {
        String str = "aabbbccccdd";
        String compressedString = compressString(str);
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressedString);
    }
    
    public static String compressString(String str) {
    	StringBuffer sb = new StringBuffer();
      char[] charArray =str.toCharArray();
    	int count =0;
    	char c = charArray[0];
    	for(int i = 0;i < charArray.length;i++) {
    		if(c == charArray[i])
    			count++;
    		else {
    			sb.append(c).append(count);
    			c=charArray[i];
    			count = 1;
    		}
    	}
    	//for last
    	sb.append(c).append(count);
    	return sb.toString();
    }
}
