/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		
		LambdaTest p = (a,b) -> a + b;
		
		int[] arr = {1,2,1,1,2,3,1,2,4,4};
		//{1,1,1,1,2,2,2,4,4,3}
		
		   Map<Integer, Integer> frequencyMap = new HashMap<>();
	       
	       for(int a : arr) {
	    	   frequencyMap.put(a,frequencyMap.getOrDefault(a, 0)+1);
	       }
	        
	       System.out.println(frequencyMap);
	       
	       List<Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

	        list.sort((a,b) -> a.getValue().compareTo(b.getValue())*-1);
	        
	        int out[] =new int[arr.length];
	        
	        int index = 0;
	        for (Entry<Integer, Integer> entry : list) {
	            int key = entry.getKey();
	            int value = entry.getValue();
	            for (int i = 0; i < value; i++) {
	                out[index++] = key;
	            }
	        }
	        System.out.println(Arrays.toString(out));
	  
	       
	    
		 
		
				}
	
	
	
}
