/**
 * 
 */
package com.learning;

/**
 * 
 */
public abstract class PrototypeScope implements Cloneable{
	
	@Override
	protected PrototypeScope clone() throws CloneNotSupportedException {
		return (PrototypeScope)super.clone();
	}

}
