package com.class05;

import java.util.Scanner;

public class LogicalOperatiosEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  ask user to enter name 
		 *  based on the age we will define 
		 *  if age is 1-->3--> you are baby 
		 *  3-->5--> you are bigger baby
		 *  5-->12--> you are kid 
		 *  13-->19--> teenager
		 *  20--> adult
		 * 
		 */
		
		Scanner input;
		String name;
		int age;
		
		input = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = input.next();
		
		System.out.println("Please enter your age");
		age = input.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println(name + " You are a baby");
		}else if(age>=3 && age<=5) {
				System.out.println(name + " You are a bigger baby");
		}else if(age>=5 && age<=12) {
			System.out.println(name + " You are kid");
		}else if(age>=13 && age<=19) {
			System.out.println(name + " teenager");
		}else if(age>=20){
			System.out.println(name + " Adult");
		}else {
			System.out.println(name + " Not born yet");
				
		}
		

	}

}
