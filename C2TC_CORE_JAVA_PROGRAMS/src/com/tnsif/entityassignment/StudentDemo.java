package com.tnsif.entityassignment;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student S1 = new Student();
		
		S1.setSId(143);
		S1.setSName("ROSHAN M");
		S1.setSContact("1234567890");
		
		System.out.println(S1);
		
		Student S2 = new Student();
		
		S2.setSId(144);
		S2.setSName("BHUVAN M");
		S2.setSContact("9876543210");
		
		System.out.println(S2);
		
		Student S3 = new Student();
		
		S3.setSId(145);
		S3.setSName("MOHAN R");
		S3.setSContact("143144143");
		
		System.out.println(S3);

	}

}
