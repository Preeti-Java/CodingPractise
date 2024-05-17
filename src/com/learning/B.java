/**
 * 
 */
package com.learning;

/**
 * 
 */
public class B implements A{

	public static void sayHello() {
		System.out.println("Hi, This is a static method  inside class");
		}
	public static void main(String[] args) {
		B b = new B();
		b.sayHello();
		B.sayHello();
		A.sayHello();
		}
}
