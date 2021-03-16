package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input;
		
		int num;
		
		int lotteryNum = 17;;
		
		input = new Scanner(System.in);
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		
		num = input.nextInt();
		
		while (num != lotteryNum) {
			
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		
		num = input.nextInt();
		
		
		}
		
		System.out.println("Congratulation you entered " + num + " which is a lucky number! ");
		
	}
	
}
