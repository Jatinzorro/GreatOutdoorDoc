package com.dao;

import java.util.Scanner;

import com.bean.ProductDTO;
import com.util.ProductCollection;

public class ProductDao {
	Scanner sc=new Scanner(System.in);
	ProductCollection pc=new ProductCollection();
	
	ProductDTO pdt=new ProductDTO();

	public void addProduct(String key,String productId, double price, String colour, String dimension, String specification, String manufacturer, int quantity, int productCategory, String productName) 
	{
		
		pc.addCollection(key,productId, price, colour, dimension, specification, manufacturer, quantity, productCategory, productName);
	}
	
	public void deleteProduct(String del) {
		pc.deleteCollection(del);
		
	}
	
	public boolean editProduct(String edi) {  //it will update the All values
		return pc.editCollection(edi);
		
	}

	public void UpdateDao(String edi) {   //it will only update the Quantity
	int oldQtt=pc.updateCollection(edi).getQuantity();
	System.out.println("Quantity of "+edi+" is "+oldQtt);
	System.out.println("Now Enter new Quantity");
	int newQtt=sc.nextInt();
	
	//Entering old other values to HAshMap
	System.out.println("-----Updated Values-----");
	pc.addCollection(edi,pc.updateCollection(edi).getProductId(),pc.updateCollection(edi).getPrice(), pc.updateCollection(edi).getColour(), pc.updateCollection(edi).getDimension(), 
			pc.updateCollection(edi).getSpecification(),pc.updateCollection(edi).getManufacturer(), newQtt,pc.updateCollection(edi).getProductCategory(), pc.updateCollection(edi).getProductName());
	}

	public void displayProductDao() {
		pc.displayCollection();
		
	}
	
}
