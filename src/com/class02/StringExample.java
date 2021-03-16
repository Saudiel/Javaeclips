package com.class02;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		name="chris";
		
		String greeting="Good Morning!";
		String phoneNumber="123-456-7890";
		
		String stringNumber="12";
		
		String wordWithSpace=" ";
		
		String letter2="a   ";
		String letter="a";
		
		char oneLetter='a';
		
		//hello, my name is chris 
		
		System.out.println("Hello, my name is "+name); 
		
		//how to chris?
		
		System.out.println("How are you "+"name"); 
		
		int age=25;
		//I am 25
		
		System.out.println("I am "+age);
		
		char grade='a';
		//Chris is a student 
		
		System.out.print(name +" is "+grade+ " student " );
		
		/*
		 *  String concatenation operator + can be used when 
		 *  we attach string to another string
		 *  we attach string to a number 
		 *  we attach string to any character or boolean
		 */
		
		String car="tesla";
		int year=2021;
		
		//I drive 2021 tesla 
		System.out.println("I drive"+year+car);
		
		String computer="Macbook";
		int memory=250;
		
		// Chris has macbook with 250 gb memory 
		 System.out.println(name+" has "+computer+" with "+memory+" GB Memory ");
		
		 String combinedValue=year+" "+car;//2021 Tesla 
		 
		 System.out.println(combinedValue);
		 
		 int day=7;
		 String month=" february ";
		 
		 String date=month+day;
		 System.out.println(date);
		 
	}

}
