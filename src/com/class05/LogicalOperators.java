package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to test 2 or more conditions we use logical operators 
		
		/* AND(&&)
		 * 
		 * true && true --> True
		 * true && false --> false
		 * false && true --> false
		 * false && false --> True
		 * 
		 * OR(||)
		 * true || true --> true
		 * true || false --> true
		 * false || true -->
		 * false || false -->
		 */

		// we need to id if the number is small,medium,large,extra large.
		
		//if 1-->10-->small, 11-->100-->medium, 101-->1000-->large, 1001-->100000-->extra large
		
		int num = 1;
		
		if (num<1) {
			System.out.println(num + " Number is 0 or negative");
		
		
	}else if(num>=1 && num<=10) {
			System.out.println(num + " Is a small number");
		}else if (num>=11 && num<=100) {
			System.out.println(num + " Is a medium number");
		}else if (num>=101 && num<=1000) {
			System.out.println(num + " Is a large number");
		}else if (num>=1001 && num<=100000) {
			System.out.println(num + " Is a medium number");
		}else {
			System.out.println(num + " Is a huge number");
		
		
		}
	}

}
