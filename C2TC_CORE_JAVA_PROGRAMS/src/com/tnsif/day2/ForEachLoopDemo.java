package com.tnsif.day2;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {10,20,30};	

		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'D','A','M','I','A','N'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"IFET","- CAPGEMINI -","TNSIF"};

		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
		
	}

}
