package com.class04;

import java.util.Scanner;

public class Demo {

	// command+shift+o
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
System.out.println("Please enter any text");
		
		String text = scan.nextLine(); // capture text with space
		                             // 
		System.out.println("Text that I entered");
		
		System.out.println("Please enter your name");
		
		String name = scan.next(); // capture 1 word 
		
		System.out.println("Nice to meet you " + name);
		
		System.out.println("Please enter your age ");
		
		int age = scan.nextInt();
		
		System.out.println("My name is " + name + " and I am " + age + " years old");
		
		System.out.println("----------------------------");
		
		

	}

}
