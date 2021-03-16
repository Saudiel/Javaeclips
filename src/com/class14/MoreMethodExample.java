package com.class14;

public class MoreMethodExample {

	// create a method that does not take any value 
	// and always returns "Hi"
	
	String print() {
		
		return "Hi";
		
	}
	
	// create method that takes a number
	// and returns the double of that number
	
	double doubleTheValue(double input) {
		
		return input*2;
		
	}
	
	// create a method that will take boolean as input
	// if the value is true i want to say " take the umbrella "
	// and if value is false print " Please go for a walk "
	
	void isRain (boolean isRain) {
		
		if (isRain) {
			
			System.out.println("Please take the unbrella");
			
		}else {
			
			System.out.println("Please go for a walk");
			
		}
		
	}
	
	void oddOrEven(double evenOrOdd) {
		
		if (evenOrOdd%2==0) {
	
			System.out.println(evenOrOdd+ " is even");
	
		}else {
	
			System.out.println(evenOrOdd+ " is odd");
		}
	}
	
	double returnTheArraySum (double [] arr) {
		
		double sum=0;
		
		for (double element :arr) {
			
			sum=sum+element;
			
		}
		
		return sum;
		
	}
	
	// write a method that returns if a string is a mirror of its self 
	// or return false 
	// ada yes
	// bbb yes 
	// bba no
	//
	
	boolean mirror (String s, String r) {
		
		if (r.equals(s)) {
			
			return true;
			
		}
		return false;
		
	}
	
	void mirror (char [] array) {
		
		for (int i=array.length-1; i<array.length; i++) {
			
			if (array [i] == array [i] ) {
				
				System.out.println("true");
				
			}else {
				
				System.out.println("false");
				
			}
			
		}
		
	}
	
	boolean isMirror(String str) {
		
		String newStr="";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			System.out.println(i +" " + str.charAt(i));
			
			newStr+=str.charAt(i);
			
		}
		
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
			
			return true;
			
		}else {
		
		return false;
		
	}
	}
	
	
	
	
}
