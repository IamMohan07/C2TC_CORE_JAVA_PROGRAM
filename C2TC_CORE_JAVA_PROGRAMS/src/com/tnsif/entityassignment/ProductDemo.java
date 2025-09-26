package com.tnsif.entityassignment;

import com.tnsif.entityclass.Customer;

public class ProductDemo {

	public static void main(String[] args) {
		
		Product P1 = new Product();
		
		P1.setPId(07);
		P1.setPName("MERCEDES-BENZ");
		P1.setPPrice("1.57 Cr");
		
		System.out.println(P1);
		
		Product P2 = new Product();
		
		P2.setPId(11);
		P2.setPName("ROLLS-ROYCE");
		P2.setPPrice("9.50 Cr");
		
		System.out.println(P2);
		
		Product P3 = new Product();
		
		P3.setPId(04);
		P3.setPName("JAGUAR");
		P3.setPPrice("60 Lakh");
		
		System.out.println(P3);

	}

}
