package com.class02;

public class AdditionVsConcatention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2); //21Hellohi
		
		System.out.println(num1+str2+num2+str1);
		
		System.out.println(str1+str2+num1+num2); //HelloHi1011
		
		String result=str1+str2+(num1+num2);
		System.out.println(result); 
		
		
		
		
		
		
		
	}

}
