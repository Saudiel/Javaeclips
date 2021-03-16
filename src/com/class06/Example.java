package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * find final price after discount 
		 * 
		 * check if there is a sale
		 * no sale --> no shopping 
		 * if sale --> we will ask for item
		 * we will ask price 
		 * 
		 * is price is less then 10 --> 5% off
		 * 10 --> 100 --> 10%
		 * 100 --> 500 --> 20%
		 * 500+ --> 30% off
		 */
		
		double price,discount,totall;
		String item ;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Is there a sale?");
		boolean sale = scan.nextBoolean();
		
		if (!sale) {
			System.out.println("I will not go shopping");
			
		}else {
			System.out.println("What item are you looking for?");
			item = scan.next();
			System.out.println("what is the price of the " + item );
			price = scan.nextDouble();
				
				if (price<10) {
					discount= price * 0.05;
					
				}else if (price>10 && price<=100) {
					discount= price * 0.10;
					
				}else if (price>100 && price<=500) {
					discount= price * 0.20;
					
				}else if (price>500) {
					discount=price * 0.3;
					
				}else {
					discount=price * 1;
					
				}
					
					totall = (price * discount - price);
				
					System.out.println("The " + item + "was " + price + 
					" now with the discount of " + discount + " its at " + totall);
				
				}
		}			
	}

