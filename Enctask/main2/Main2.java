package com.main2;

import com.manufacturer.Manufacturer;
import com.product.Product;

public class Main2{
	public static void main(String[] args) {
		Manufacturer manufacturerObject=Manufacturer.getManufacturerObject("Phone", "Hyd", "1234554321");
		Product productObject=Product.getProductObject("IQOO", "Andriod Mobiles", manufacturerObject, 75000);
		if(manufacturerObject==null && productObject==null) {
			System.out.println("Invalid Product/Manufacturer");
		}
		else {
			System.out.println(manufacturerObject);
			System.out.println(productObject);
		}
	}

}
