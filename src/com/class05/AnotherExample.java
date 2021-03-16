package com.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 10-->100-->10%
		 * 101-->500-->20%
		 * 501-->1000-->30%
		 * 100+-->50%
		 */

		Scanner scan;
		double saleAmount, commission;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your daily sale amount");
		saleAmount = scan.nextDouble();
		
		if (saleAmount<10) {
			commission=0;
		}else if (saleAmount>10 && saleAmount<100) {
			commission=saleAmount*0.1;
		}else if (saleAmount>100 && saleAmount<=500) {
			commission=saleAmount*0.2;
		}else if (saleAmount>500 && saleAmount<=1000) {
			commission=saleAmount*0.3;
		}else {
			commission=saleAmount*0.5;
		}
			System.out.println("Your daily commission is " + commission);
		if (commission>500) {
			System.out.println("You are an amazing seller!");
		}
		
	}

}
// if commission is more then 500 your an amazing seller