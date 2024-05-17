/**
 * 
 */
package com.learning;

import java.util.stream.Stream;

/**
 * 
 */
class Test extends BinaryOperatorExample
{  
	
	
	
	   
    static int test_a;
	int test_b;  
    Test(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    System.out.println("Test");
    }  
    
    
    public static void main(String[] args)   
    {  
    	
    	String s1 = "Sharma is a good player and he is so punctual";  
        String words[] = s1.split(" ");  
       
       Stream<String>  dtream = Stream.of(words);
       dtream.map(e -> ( e.substring(0,1).toUpperCase()+""+e.substring(1, e.length()) +" ")).forEach(System.out::print);
    		   
    	
    	 String s="Sachin";  
  	   String j = s.concat(" Tendulkar"); 
  	   System.out.println(s);
  	   System.out.println(j);
  	   
        Test test = new Test(test_a, test_a);   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
}