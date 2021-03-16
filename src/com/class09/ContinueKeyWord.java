package com.class09;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10; i++ ) {
			
			System.out.println("Hello ");
			
			if (i==3) {
				
				continue;
				
			}
			
			System.out.println("I am inside th loop ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		for (int i=1; i<=10; i++ ) {
			
			if (i==5 || i==6) {
				
				continue;
				
			}
				
				System.out.print(i + " ");
				
		}
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
        for (int i=1; i<=40; i++ ) {
			
			if (i%4==0) {
				
				continue;
		
			}
			
			System.out.print(i + " ");
			
	}
}
}
