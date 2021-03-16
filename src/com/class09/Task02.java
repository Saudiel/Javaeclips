package com.class09;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item;
		
		int price;
		int money;
		int remainder;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter item");
        item=input.nextLine();

        System.out.println("What is the price" + item);
        price=input.nextInt();

  do {

        System.out.println("Please pay for " + item);
	    money=input.nextInt();
	
	if (money<price) {
    remainder=price-money;
		System.out.println("Please enter" + remainder);

	}else if (money>price) {
		remainder=money-price;
				System.out.println("Here is your change" + remainder);

	}else {
		System.out.println("Exact totall");

	}
	
  }while (price!=money);
  System.out.println("Thank you for shoping");

	
  
}
}
