package com.daoTest;

import com.bean.ProductDTO;
import com.dao.*;
import com.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DaoTest {

	ProductDao pd=new ProductDao();

	@Test
	void testAddProduct() {
		pd.addProduct("watch", "e2",1200.0,"black","8*3 cm","leather strap","titans",3,5,"Watch");
		assertEquals("e2",ProductCollection.stockMap.get("watch").getProductId());
	}
	
	
	@Test
	void testSearchKey()  //this method checks weather a particular key is there or not
	{
	    assertTrue(pd.editProduct("watch"));
	}
	
	
	@Test
	void testDeleteProduct() { //this test will check that a particular key is there or not and after deleting
								//it is there or not
		assertTrue(ProductCollection.stockMap.containsKey("watch"));
		pd.deleteProduct("watch");
		assertFalse(ProductCollection.stockMap.containsKey("watch"));
	}
	
	
	@Test
	void testUpdatedQtt() {
		pd.updateDao("balls");  //while checking, make the qtt 100 in console...then further program will run true
		assertEquals(100,ProductCollection.stockMap.get("balls").getQuantity());
		
	}
	
	
	
	
	
}
