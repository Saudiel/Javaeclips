package com.class05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, largest;
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Please enter any 3 numbers ");
		num1=input.nextInt();
		
		num2=input.nextInt();
		
		num3=input.nextInt();
		
		if (num1==num2 && num2==num3) {
			System.out.println("Numbers are equal");
			
		}else {
		
		if (num1>num2) {
		   
			if (num1>num3) {
				largest=num1;
			} else {
				largest=num3;
			
			}
		} else {
			    if (num2>num3) {
			     largest=num2;
	           } else  {
	    	     largest=num3;
	    }

	}
		
		System.out.println("The largest number amoung " + num1 + ", " + num2 + ", " + num3 + ", is " + largest);
		
		}
	}
}
