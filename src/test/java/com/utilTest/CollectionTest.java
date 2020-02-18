package com.utilTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.util.ProductCollection;

class CollectionTest {
	
	ProductCollection pc=new ProductCollection();
	@Test
	void testeditCollection() {
		 assertTrue(pc.editCollection("watch"));
	}

}
