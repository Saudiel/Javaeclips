package com.class09;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean rain=true;
		
		int temp=60;
		
		while (rain) {
			
			System.out.println("I will stay home ");
			
			if (temp>75) {
				
				System.out.println("I will walk under warm rain ");
			
			break;
			
			}	
		
		     temp+=2;           //System.out.println("I am a code inside while loop ");
			
		}

		System.out.println("-------------------------------------------------------");
		
		for (int i=1; i<=3; i++ ) {
		
			System.out.println("Hello ");
			
			if (i==5) {
			
			break;
			
			
			}
			
			System.out.println("I am inside the loop ");
			
	}
	}
}
