package com.class02;

public class VariableDecleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 way to create a variable
		short b=200; // create a variable and assign value 
		//declare a variable and initialized
		
		//2 way
		int sum; //declaration happens only once 
		sum=20; //initialized the variable 
		
		sum=30; // reassign the value 
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		int x,y,z,w,q;
		
		x=10;
		y=20;
		//z=30.9; error: type mismatch, since variable can store only int type of value
		
		//i would like to change the value of x
		x=70;
				System.out.println(x);
		
		int num=33;
		//we are using value of diffrent variable to initialize the 
		int num2=num;//33
		
		
	}

}
