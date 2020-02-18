package com.util;
import java.util.HashMap;
import java.util.Map;


import com.bean.ProductDTO;

public class ProductCollection {
		public static Map<String,ProductDTO> stockMap=new HashMap<String,ProductDTO>();
	    
 
		//"product id",double price,"colour","dimensions","specification","manufacturer",int qtt, int Product_Catagory,"product name"

		/*Product Categories:
		 * 1.Camping
		 * 2.Golf
		 * 3.Mountaineering
		 * 4.Outdoor Protection+
		 * 5 Personal Accessories
		 * */
		static
		{
		stockMap.put("a1",new ProductDTO("a1",1200.0,"red","7 meter","Comfartable","nike",3,1,"Sleeping Bag"));
		stockMap.put("a2", new ProductDTO("a2",12000.0,"red","3 meter","Can adjust 4 people","Hamswood",3,1,"Tent"));
		stockMap.put("a3", new ProductDTO("a3",120.0,"Multicolor","1.5 meter","Knife Lighter","local",3,1,"CampingKit"));
		
		stockMap.put("b1", new ProductDTO("b1",1100.0,"Maroon","1 meter","Rubber Handle","spartan",3,2,"Golf clubs"));
		stockMap.put("balls", new ProductDTO("b2",100.0,"white","5cm radious","non bouncy","vicky",3,2,"Golf balls"));
		stockMap.put("gloves", new ProductDTO("b3",250.0,"brown","10 cm","cotton inside","adidas",3,2,"Gloves"));
		
		stockMap.put("bag", new ProductDTO("c1",900.0,"yellow","1 meter","Comfortable","nike",3,3,"Bag"));
		stockMap.put("rope", new ProductDTO("c2",500.0,"grey","15 meter","Strong and strechable","puma",3,3,"Rope"));
		stockMap.put("hammer", new ProductDTO("c3",230.0,"brown","25cm","Rubber Handle","local",3,3,"Hammer"));
		
		stockMap.put("sun hat", new ProductDTO("d1",140.0,"grey","10 cm","lightweight ","underarmour",4,4,"Sun hat"));
		stockMap.put("umbrella", new ProductDTO("d2",260.0,"bawa","100 cm","couple special","delight",4,4,"Umbrella"));
		stockMap.put("sun cream", new ProductDTO("d3",380.0,"white","100g","suitable to all skin","nevia",3,4,"Sun cream"));
		
		stockMap.put("trimmer", new ProductDTO("e1",800.0,"orange","12  cm","Rubber Handle","philips",3,5,"Trimmer"));
		stockMap.put("watch", new ProductDTO("e2",1200.0,"black","8*3 cm","leather strap","titans",3,5,"Watch"));
		stockMap.put("wallet", new ProductDTO("e3",120.0,"black","8*8 cm","leather","lv",3,5,"Wallet"));
		}
		
		public void addCollection(String key,String productId, double price, String colour, String dimension, String specification, String manufacturer, int quantity, int productCategory, String productName)
		{
			stockMap.put(key,new ProductDTO(productId, price, colour, dimension, specification, manufacturer, quantity, productCategory, productName));

			System.out.println("PRODUCT ID : "+stockMap.get(key).getProductId());
			System.out.println("PRICE : "+stockMap.get(key).getPrice());
			System.out.println("COLOUR :"+stockMap.get(key).getColour());
			System.out.println("DIMENSIONS : "+stockMap.get(key).getDimension());
			System.out.println("SPECIFICATION : "+stockMap.get(key).getSpecification());
			System.out.println("MANUFACTURER :  "+stockMap.get(key).getManufacturer());
			System.out.println("QUANTITY : "+stockMap.get(key).getQuantity());
			System.out.println("PRODUCT CATAGORY NUMBER"+stockMap.get(key).getProductCategory());
			System.out.println("PRODUCT NAME "+stockMap.get(key).getProductName());
			System.out.println("---------------------------------");
		}
		
		
		
		public void deleteCollection(String del) {
			if(stockMap.containsKey(del)) {
			stockMap.remove(del);
			System.out.println("-----Product deleted Successfully-----");
			}
			else {
				System.out.println("-----Already This product was Not There in Our Database-----");
			}
		}


		public boolean editCollection(String edi) {
			if(stockMap.containsKey(edi)) {
			System.out.println("Quantity of "+edi+" which is Already Present is: "+stockMap.get(edi).getQuantity());
			}
		return stockMap.containsKey(edi);	
		}


		public ProductDTO updateCollection(String edi) {
			return stockMap.get(edi);	
		}


		public void displayCollection() {
			for (Map.Entry<String, ProductDTO> entry : stockMap.entrySet()) {
			    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
			}
			
		}
		
		
			
}
