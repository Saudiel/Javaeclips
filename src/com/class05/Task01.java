package com.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 */

		Scanner pp;
		String name;
		double height;
		
		pp = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = pp.next();
		
		System.out.println("Please enter your height");
		height = pp.nextInt();
		
		if(height<=0 ) {
			System.out.println(name + " Invalid");
		}else if(height<=60) {
			System.out.println(name + " You are short");	
		}else if(height>=61 && height<=72) {
				System.out.println(name + " You are medium");
		}else if(height>=73) {
			System.out.println(name + " You are tall");
		
				
		}
		
		
	}

}
