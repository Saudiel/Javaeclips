package com.class14;

public class MoreMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoreMethodExample moreMethodExample=new MoreMethodExample();
		
		System.out.println(moreMethodExample.print());
		
		System.out.println(moreMethodExample.doubleTheValue(10));
		
		moreMethodExample.isRain(false);
		
		// System.out.println(moreMethodExample.isRain(true)); error as we are not returning
		
		moreMethodExample.oddOrEven(12);
		
		//moreMethodExample.();
		
		double [] arr= {10,11,12};
		
		System.out.println(moreMethodExample.returnTheArraySum(arr));
		
		char [] array = {'b', 'b', 'a'};
		
		moreMethodExample.isMirror("aba");
		
		System.out.println(moreMethodExample.isMirror("abcdef"));
		
	}

}
