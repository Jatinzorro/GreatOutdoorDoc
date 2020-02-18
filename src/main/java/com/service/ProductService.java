package com.service;

import com.dao.ProductDao;

public class ProductService {
	
	ProductDao pd=new ProductDao();
	public void addService(String key,String productId, double price, String colour, String dimension, String specification, String manufacturer, int quantity, int productCategory, String productName) {
		pd.addProduct(key,productId, price, colour, dimension, specification, manufacturer, quantity, productCategory, productName);
	}
	
	public void deleteService(String del) {
		pd.deleteProduct(del);
	}

	public boolean editService(String edi) {
		return pd.editProduct(edi);
		
	}

	public void updateQtt(String edi) {
		pd.UpdateDao(edi);
		
	}

	public void displayService() {
		pd.displayProductDao();
		
	}

	
	
}
