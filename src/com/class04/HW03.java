package com.class04;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your City name");
		
		String name = scan.nextLine();
		
		System.out.println("Enter temperature");
		
		double temp = scan.nextInt();
		
		temp = (temp-32)*(0.5556);
		
		System.out.println("The temperature is the city " + name + " is " + temp );
		
		
		

	}

}
