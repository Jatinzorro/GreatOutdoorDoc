package com.daoTest;
import com.bean.*;
import com.dao.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaoTest {

	@Test
	void testaddProduct() {   //test ke aage kuch bhi naam de skte hai RULE 
		ProductDao pd=new ProductDao();
		pd.addProduct("watch", "a11", 2343, "red", "25cm", "Good", "puma", 2, 3, "watch");
		fail("Not yet implemented");
	}

}
