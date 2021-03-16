package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input;
		
		String country,food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter country ");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) { // use toLowerCase or toUpercase and convert case to lower of upper depending on equals.-
		
		case "usa":
			food="Burger";
			break;
			
		case "afghanistan":
			food="Kabab";
			break;
			
		case "vitnam":
			food="Pho";
			break;
			
		case "poland":
			food="Pierogi";
			break;
			
		case "kazakstan":
			food="Horse";
			break;
			
		case "belarus":
			food="Draniki";
			break;
			
		case "tajikistan":
			food="Plov";
			break;
			
		case "mexico":
			food="Taco";
			break;
			
		case "elsalvador":
			food="Pupusas";
			break;
			
			default:
				food="Unknown";
				
			
		}
		
		System.out.println("Your favorite food is " + food);
		
		
	}
}
