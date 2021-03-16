package com.class04;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your age ");
		
		int num3=input.nextInt();
		int num4=18;
		
		if (num3>num4) {
			System.out.println("You are eligible for a license! ");
		
		}else if (num3<num4) {
		System.out.println("Sorry for a license you must be 18+ of age, but you might be eligible for a learners permit. ");
		
		}
		
	}

}
