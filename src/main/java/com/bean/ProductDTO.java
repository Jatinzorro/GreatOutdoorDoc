package com.bean;

public class ProductDTO {
	private String productId;
	private double price;
	private String colour;
	private String dimension;
	private String specification;
	private String manufacturer;
	private int quantity;
	private int productCategory;
	private String productName;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	public ProductDTO(String productId, double price, String colour, String dimension, String specification,
			String manufacturer, int quantity, int productCategory, String productName) {
		super();
		this.productId = productId;  //alpha numeric must start with alphabet
		this.price = price;
		this.colour = colour;
		this.dimension = dimension;
		this.specification = specification;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.productCategory = productCategory;
		this.productName = productName;
	}
	
	
	
	@Override
	public String toString() {
		return "ProductData [productId=" + productId + ", price=" + price + ", colour=" + colour + ", dimension="
				+ dimension + ", specification=" + specification + ", manufacturer=" + manufacturer + ", quantity="
				+ quantity + ", productCategory=" + productCategory + ", productName=" + productName + "]";
	}
	public ProductDTO() {
		super();
	}
	
	
	
}
