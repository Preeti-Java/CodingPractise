/**
 * 
 */
package com.learning;

/**
 * 
 */
public class SingletonScope {
	
	private static SingletonScope instance;
	
	/**
	 * 
	 */
	public SingletonScope() {
	}
	
	public static SingletonScope getInstance() {
		if(instance == null) {
			return new SingletonScope();
		}
		return instance;
	}

}
