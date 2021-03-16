package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		
		int num;
		
		int lotteryNum = 17;;
		
		input = new Scanner(System.in);
		
		do {
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		
		num = input.nextInt();
		
		} while (num!=lotteryNum);
		
		System.out.println("Congratulation you entered " + num + " which is a lucky number! ");
		
		
	}

}
