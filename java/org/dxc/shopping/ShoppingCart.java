package org.dxc.shopping;

import java.util.Scanner;
import org.dxc.shopping.service.*;
import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;

public class ShoppingCart 
{
public static void main( String[] args ) throws ProductException{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Product Name");  	
	System.out.println("Enter the Product Price");  	
	System.out.println("Enter the Product Quantity");
	Product product=new Product(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
	CartOperationService cartService=new CartOperationServiceImpl(10.2f); 
	cartService.removeFromCart(product);
	System.out.println("Enter the number of products");
	int number=Integer.parseInt(s.nextLine());
	
	
	
	for(int i=0;i<number;i++) {
	System.out.println("Enter the Product Name");  	
	System.out.println("Enter the Product Price");  	
	System.out.println("Enter the Product Quantity");
	
	Product p=new Product(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
	
	cartService.addToCart(p);
	
	}
	System.out.println(cartService.getInvoiceAmount());
	
	System.out.println("Remove Product? yes or no");
	
	
	if(s.nextLine().equalsIgnoreCase("yes")) {
		
		System.out.println("Enter the  Product Name");  	
    	System.out.println("Enter the  Product Price");  	
    	System.out.println("Enter the  Product Quantity");
		Product p=new Product(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
		cartService.removeFromCart(p);
		
	}
	
	
	System.out.println(cartService); 
	

    
}


}