package com.LambdaExpressions;

public class Product {
	
	String name;
	int price;
	
	public Product() {

		System.out.println("Ruuning Products Sucessfully");
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	

}
