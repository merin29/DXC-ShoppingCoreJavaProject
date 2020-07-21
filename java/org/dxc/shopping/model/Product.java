package org.dxc.shopping.model;

public class Product {
	String name;
	float price;
	int quantity;
	
	public Product(String name,float price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return name;
	}

	
}
