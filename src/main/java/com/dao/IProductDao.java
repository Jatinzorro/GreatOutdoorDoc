package com.dao;

public interface IProductDao {
	public void addProduct(String key,String productId, double price, String colour, String dimension, String specification, String manufacturer, int quantity, int productCategory, String productName); 
	//add a new product to collection
	
	public void deleteProduct(String del); //to delete a particular product
	
	public boolean editProduct(String edi); //it will update the All values
	public void updateDao(String edi);  //it will only update the Quantity

	
	public void displayProductDao();  //to display all products
}
