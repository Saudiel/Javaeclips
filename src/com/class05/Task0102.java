package com.class05;

import java.util.Scanner;

public class Task0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner pp;
	String name;
	double height;
	String definition;
	
	pp = new Scanner(System.in);
	System.out.println("Please enter your name");
	name = pp.next();
	
	System.out.println("Please enter your height");
	height = pp.nextInt();
	
	if(height<=0 ) {
		
		definition = "invalid";

	}else if(height<=60) {
		
		definition = "short";
	
	}else if(height>=61 && height<=72) {
			
		definition = "medium";


	}else if(height>=73) {
		
		definition = "tall";

		System.out.println("");

	
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter three grades");
		int one=input.nextInt();
		int two=input.nextInt();
		int three=input.nextInt();
		
		int ave=(one+two+three)/3;
		
		String grade = null;
		
	}	
	}
}
