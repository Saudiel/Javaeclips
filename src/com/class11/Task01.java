package com.class11;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		double sum=0;
		
		System.out.println("How many elements you want to store");
		int size=s.nextInt();
		
		double[] d=new double[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Enter double value");
			d[i]=s.nextDouble();
			sum+=d[i];
		}
		
		System.out.println("The sum of " + size + " doubles is equal to " + sum );
		
		System.out.println(sum);
		
		sum=0;
		
		for (double num:d) {
			
			sum+=num;
			
		}
		
		System.out.println("The sum of " + size + " doubles is equal to " + sum );
		
	}

}
