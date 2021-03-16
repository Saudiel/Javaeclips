package com.class02;

public class ArithmeticOperatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=5;
		
		// +,*,/,-,%
	
		System.out.println(num1+num2); 
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		// sum of unmber 10 and 5 is ==15 
		
		System.out.println("sum of number "+num1+" and "+num2+"is = " +sum);
		System.out.println("sum of number 10 and 5 is = 15");
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number1/number2;
		
		System.out.println("Result of the division of 2 double values");
		
		float n1=10.99f;
		float n2=90.00f;
		
		float divisionOfFloat=n2/n1;
		
		System.out.println("Result of division of 2 float values "+divisionOfFloat);
		
		// precedence PEM-DAS
		int result=10+2*5;
		System.out.println(result);
		
		// MODULUS operator--> shows reminder of the division 
		
		int mod=10%3;
		System.out.println(" Remainder is="+ mod );// 1
		
		int mod1=10%2;
		System.out.println(" Remainder is="+ mod1 );// 0
		
		int mod2=15%4;
		System.out.println(" Remainder is="+ mod2 );// 3
		
		int r=(20%7)*3;
		System.out.println(r);
		
		
		
		
	}

}
