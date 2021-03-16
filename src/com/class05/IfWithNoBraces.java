package com.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "Friday";
		
		
		
		System.out.println(" ----- With  no Braces ----- ");
		
		
		
		if(day.equals("Friday"))
		
			System.out.println("Today is my movie day");
		
		System.out.println("Tomorrow I have class at Syntax ");
		
		System.out.println(" ----- End of the program ----- ");
	
		
		
		System.out.println(" ----- With Braces ----- ");
		
		
		
		if(day.equals("Friday")) {
		
			System.out.println("Today is my movie day");
		
		System.out.println("Tomorrow I have class at Syntax ");
		
		}
		
		System.out.println(" ----- End o the program ----- ");
	
		int num=10;
		
		if (num>=10);
		
		System.out.println("Number is larger than 10");
		
		// no braces java can only id one statment it can be in if or else block 
			System.out.println("Number is less then 10");
		System.out.println("Second statment inside else block");
		

	}

}
