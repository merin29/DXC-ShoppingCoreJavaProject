package org.dxc.shopping.exception;

public class ProductException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String productName;
	
	public ProductException() {
		super();
	}
	public ProductException(String productName) {
		super();
		this.productName = productName;
	}
	@Override
	public String toString() {
		return productName+" Product is not available";
	}

}
