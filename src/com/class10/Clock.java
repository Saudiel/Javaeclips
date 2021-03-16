package com.class10;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("---------------------------------------------------");
		
        for (int a=0; a<2; a++) {
			
			for (int b=0; b<=3; b++) {
				
				 for (int c=0; c<=5; c++) {
						
						for (int d=0; d<=9; d++) {
							
				System.out.println(a +  " " + b +  " : " + c +  " " + d);
				
				
			}
			
		}
			}
}
		
	System.out.println("---------------------------------------------------");
		
		for (int i=1; i<24; i++) {
			
			for (int j=0; j<=59; j++) {
				

				System.out.println(i +  " : " + j);
				
				
			}
			
		}
		
System.out.println("---------------------------------------------------");
		
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<60; m++) {
				
				if (h<10 && m<10) {
					System.out.println("0" + h + " : 0" + m);
			
				} else if (h < 10 && m >= 10) {
				System.out.println("0" + h + " : " + m);
				
				} else if (h >= 10 && m < 10) {
					System.out.println(h + " : 0" + m);
						
				} else {
				System.out.println(h +  " : " + m);
				
				
				}
			
		}
		
	}
		
System.out.println("---------------------------------------------------");
		
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<60; m++) {
				
				if (h<10 ) {
					
					if (m<10) {
						
					System.out.println("0" + h + " : 0" + m);
			
					} else {
						System.out.println("0" + h +  " : " + m);
						
				}
					
				} else {
					
					if (m<10) {
						System.out.println(h + " : 0" + m);
						
				} else {
				      System.out.println(h +  " : " + m);
								
					}
					}
			}
				
			}	
		
System.out.println("---------------------------------------------------");
		
		for (int a=0; a<=9; a++) {
			
			for (int b=0; b<=9; b++) {
				

				System.out.println(a +  " x " + b + " = " + a*b);
				
				
			}
			
		}
		
	}
}
