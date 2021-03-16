package com.class09;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input;

int num1, num2;

input = new Scanner(System.in);

System.out.println("Enter 2 whole numbers");

num1 = input.nextInt();

num2 = input.nextInt();

if (num1>num2) {

for(int i=num2; i>=num1; i-=2) {
	System.out.print(i + " ");


}
	}
	}
}
