package com.class09;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	
		int money;
			
			System.out.println("Please pay for soda");
	
			money=input.nextInt();
	
			while (money !=3) {
			
			if(money>3) {
			
				System.out.println("Please give less money");
				
			}else if(money<3){
			
				System.out.println("Please give more money");
			
			}
		
			}while(money!=3);
		
		System.out.println("You can take your soda");	
		
	
	}
}
