package com.class09;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		boolean iWould=true;
		
		do {
		
			System.out.println("Would you like to apply to a credit card?");
		
			iWould=input.nextBoolean();
			
			}while(!iWould); {
			
			System.out.println("You are qualified");
		
	}
	}
}
