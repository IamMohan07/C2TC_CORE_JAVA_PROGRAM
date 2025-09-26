package com.tnsif.basics;
import java.util.*;

public class AdditionScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int A = s.nextInt();
		int B = s.nextInt();
		
		int C = A + B;
		System.out.println("Addition of A="+A+" and B="+B+" is " +C);
		

	}

}
