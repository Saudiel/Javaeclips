package com.class04;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String creditCard;
		double balance;
		Scanner scan;
		
        scan = new Scanner(System.in);
		
		System.out.println("DO you currently hold a crdit card?");
		
		creditCard = scan.next();
		
		if (creditCard.equalsIgnoreCase("Yes")) {
		
			System.out.println("What is your current balance on this card. ");
			
			balance = scan.nextDouble();
			
		if (balance>100000) {
			System.out.println("Pay off your current balance.");
			
		}else {
				System.out.println("Looks like you have some money to spend there.");
			
		}
				
		}else { 
					System.out.println("Sorry to hear that, we are offering you a chance to apply for one TODAY!");
					
				
			}
			}
			
		}
			
		

	


