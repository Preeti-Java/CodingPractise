/**
 * 
 */
package com.learning;

/**
 * 
 */

public class Product {

	String productName;
	int price;
	/**
	 * @return the product
	 */
	public String getProduct() {
		return productName;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.productName = product;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @param productName
	 * @param price
	 */
	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	
	
	
	
}
