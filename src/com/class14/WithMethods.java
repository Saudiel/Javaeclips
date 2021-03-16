package com.class14;

public class WithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num1=10;
		
		int num2=-1;
		
		int num3=0;
		
		checkNumbers(num1);
		
		checkNumbers(num2);
		
		checkNumbers(num3);
		
	}
	
	public static void checkNumbers (int num) {
		
if (num>0) {
			
			System.out.println(num + " is grater than zero ");
			
		}else if (num<0) {
			
			System.out.println(num + " is less then zero ");
			
		}else { 
			
			System.out.println(num + " is zero ");
		
		}
			
	}

}
