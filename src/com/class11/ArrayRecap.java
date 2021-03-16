package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array that will store elements from user
		
		Scanner scan;
		
		String element;
		
		String [] array;
		
		scan = new Scanner(System.in);
		
		System.out.println("How many String elements would ypu like to store ");
		
		int size=scan.nextInt();
		
		array = new String[size];
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Please enter String");
			
			array [i] = scan.next();
			
		}
		
		System.out.println("------------- lets see what we have stored ----------------");
		
		for (String str:array) {
			
			System.out.println(str + " ");
			
		}
		
	}

}
