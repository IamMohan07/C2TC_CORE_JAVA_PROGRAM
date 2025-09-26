package com.tnsif.entityclass;

public class CustomerDemo {
	
	public static void main(String[] args) {
	Customer c1 = new Customer();
	
	c1.setId(101);
	c1.setCname("DAMIAN");
	c1.setCity("Valavanur");
	
	System.out.println(c1);
	
	Customer c2 = new Customer();
	
	c2.setId(111);
	c2.setCname("ANYA");
	c2.setCity("Valavanur");
	
	System.out.println(c2);
	
	}


}
