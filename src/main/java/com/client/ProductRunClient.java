package com.client;

import java.util.Scanner;

import com.bean.ProductDTO;
import com.service.ProductService;
import com.service.Validation;
import com.util.ProductCollection;

public class ProductRunClient {

	public static void main(String[] args) {
		
		ProductService ps=new ProductService();
		ProductCollection pc = new ProductCollection();
		ProductDTO pd=new ProductDTO();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1.Add a new Product"+"\n"+"2.Edit an Existing Product"+"\n"+"3.Delete an Existing Product"+"\n"+"4.Display All Products Available in Store");
			choice=sc.nextInt();
			switch(choice){    //Main Switch of program choice
			case 1:
				System.out.println("Enter product ID");
				String p_c;
				while(true)
				{
				String productId=sc.next();
				boolean b1 = Validation.validatedata(productId,Validation.productIdpattern);  //validating productId in alphaNumeric Form
				if(b1 == true)
				{
					try 
					{
						p_c = productId;
						break;
					}
					catch(Exception e)
					{
						System.out.println("Wrong Values !!!");
					}
				}
				else
				{
					System.out.println("--Please Enter Again the Product ID in AlphaNumeric Form!!!--");
				}
				}
				pd.setProductId(p_c);
				
				System.out.println("Enter Price:");
				pd.setPrice(sc.nextDouble());
				System.out.println("Enter Colour: ");
				pd.setColour(sc.next());
				System.out.println("Enter Dimensions String type: ");
				pd.setDimension(sc.next());
				System.out.println("Enter Specification: ");
				pd.setDimension(sc.next());
				System.out.println("Enter Manufacturer: ");
				pd.setManufacturer(sc.next());
				System.out.println("Enter quantity: ");
				pd.setQuantity(sc.nextInt());
				System.out.println("Enter product category number:");
				pd.setProductCategory(sc.nextInt());
				System.out.println("Enter producct name");
				pd.setProductName(sc.next());
							
				ps.addService(pd.getProductId(),pd.getProductId(),pd.getPrice(),pd.getColour(),pd.getDimension(),pd.getSpecification(),pd.getManufacturer(),pd.getQuantity(),pd.getProductCategory(),pd.getProductName());
				System.out.println("Values Entered Successfully");
				
				break;
			
				
				
				
			case 2:     //case 2 is for editing and it has another switch 
				System.out.println("Enter the key whose value you want to edit :");
				String edi=sc.next();
				if(ps.editService(edi)) {
					
					System.out.println("----Now Enter ur choice----");
					System.out.println("1.Updtate quantity");
					System.out.println("2.Update all Values");
					int choice2=sc.nextInt();
					// Switch for edit option
					switch(choice2){
					case 1:
						ps.updateQtt(edi);
						break;
						
					case 2:
						System.out.println("Enter product ID");
						String p_c1;
						while(true)
						{
						String productId=sc.next();
						boolean b1 = Validation.validatedata(productId,Validation.productIdpattern);
						if(b1 == true)
						{
							try 
							{
								p_c1 = productId;
								break;
							}
							catch(Exception e)
							{
								System.out.println("Enter Again!!!");
							}
						}
						else
						{
							System.out.println("Wrong details Enter Again!!!");
						}
						}
						pd.setProductId(p_c1);
						System.out.println("Enter Price:");
						pd.setPrice(sc.nextDouble());
						System.out.println("Enter COLOUR");
						pd.setColour(sc.next());
						System.out.println("Enter Dimensions String type");
						pd.setDimension(sc.next());
						System.out.println("Enter Specification");
						pd.setDimension(sc.next());
						System.out.println("Enter Manufacturer");
						pd.setManufacturer(sc.next());
						System.out.println("Enter quantity");
						pd.setQuantity(sc.nextInt());
						System.out.println("Enter product category");
						pd.setProductCategory(sc.nextInt());
						System.out.println("Enter producct name");
						pd.setProductName(sc.next());
						ps.addService(edi,pd.getProductId(),pd.getPrice(),pd.getColour(),pd.getDimension(),pd.getSpecification(),pd.getManufacturer(),pd.getQuantity(),pd.getProductCategory(),pd.getProductName());
						System.out.println("-----Values Entered Successfully------");
						break;
						
					default:
						System.out.println("-----Wrong Choice Entered-----");
						break;		
					}
				}
				else {
					System.out.println("-----Product is not present-----");
				}
				break;
				
				
				
				
				
			case 3:
				System.out.println("Enter Hashmap Key to delete the product :");
				String del=sc.next();
				ps.deleteService(del);
				
				break;
				
			case 4:
				System.out.println("-----------------WHOLE DATABASE-----------------");
				ps.displayService();
				
				break;
	
				
			default:
				System.out.println("----Wrong Choice Entered----");
				break;
			}
		}
	}

}
