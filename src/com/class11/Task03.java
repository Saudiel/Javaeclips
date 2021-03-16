package com.class11;



import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;

		String name, num; 

		int age;

		scan = new Scanner(System.in);
		System.out.println("Enter your name");
		name = scan.nextLine();

		scan = new Scanner(System.in);
		System.out.println("Enter your mobile number ");
		num = scan.nextLine();

		scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();

		System.out.printf("Your name is " + name + " your age is " + age + " and your mobile number is " + num);
		
	}

}
