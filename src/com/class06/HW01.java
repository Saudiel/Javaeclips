package com.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input;
		
		String country,language;
		
		input=new Scanner(System.in);
		System.out.println("Please enter country ");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) { // use toLowerCase or toUpercase and convert case to lower of upper depending on equals.-
		
		case "usa":
			language="English";
			break;
			
		case "afghanistan":
			language="Dari";
			break;
			
		case "vitnam":
			language="Vietnamese";
			break;
			
		case "poland":
			language="Polish";
			break;
			
		case "kazakstan":
			language="Russian";
			break;
			
		case "tajikistan":
			language="Tajiki";
			break;
			
		case "elsalvador":
			language="Spanish";
			break;
			
			default:
				language="Unknown";
				
			
		}
		
		System.out.println("You speak " + language);
		
		
	}

}
