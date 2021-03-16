package com.class04;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter amount of loan needed ");
		
		int num1=input.nextInt();
		int num2=200000;
		
		if (num1>num2) {
			System.out.println("Sorry no loan pass 200000 are being accepted. ");
		
		}else if (num1<=num2) {
		System.out.println("Loan accepted money is yours! ");
		
		}
	
		
		
	}

}
