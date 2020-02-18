package com.serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.ProductService;
import com.util.ProductCollection;

class ServiceTest {
	ProductService ps=new ProductService();

	@Test
	void testAddProduct() {
		ps.addService("watch", "e2",1200.0,"black","8*3 cm","leather strap","titans",3,5,"Watch");
		assertEquals("e2",ProductCollection.stockMap.get("watch").getProductId());
	}
	
	
	@Test
	void testSearchKey()  //this method checks weather a particular key is there or not
	{
	    assertTrue(ps.editService("watch"));
	}
	
	
	@Test
	void testDeleteService() { //this test will check that a particular key is there or not and after deleting
								//it is there or not
		assertTrue(ProductCollection.stockMap.containsKey("watch"));
		ps.deleteService("watch");
		assertFalse(ProductCollection.stockMap.containsKey("watch"));
	}
	
	
	@Test
	void testUpdatedQtt() {
		ps.updateQtt("balls");  //while checking, make the qtt 100 in console...then further program will run true
		assertEquals(100,ProductCollection.stockMap.get("balls").getQuantity());
		
	}

	
	
}
