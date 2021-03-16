package com.class03;

public class Casting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i=10.99; type mismatch
		
		double d=10;
		// casting = converting one data type another 
		System.out.println(d);
		// types 1 
		
		// widening/implicit (automatically)
		// byte -> short -> int -> long -> float -> double 
		
		int i=(int)12.99;
		System.out.println(i);
		// type2
		
		// narrowing/explicit (manually)
		// double -> float -> long -> int -> short -> byte
		
		//byte b=130;
		byte b=(byte)130;
		System.out.println(b);
		
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);//2
		
		int number=12;
		double result=number/5;
		System.out.println(result);//2.0
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);
		
		//int num1=10+10.5;
		double num1=10+10.5;
		System.out.println(num1);
		
		
		
	}

}
