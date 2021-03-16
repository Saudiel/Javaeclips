package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 2;
		String weekday;
		
		if (day==1) {
			weekday = "Monday";
		}else if (day==2) {
			weekday = "Tuseday";
		}else if (day==3) {
			weekday = "Wednesday";
		}else if (day==4) {
			weekday = "Thursday";
		}else if (day==5) {
			weekday = "Friday";
		}else if (day==6) {
			weekday = "Saturday";
		}else if (day==7) {
			weekday = "Sunday";
		}else { 
			weekday = "Invalid";
		}
		
		if (!weekday.equals("Invalid")) {
			System.out.println("Today is " + weekday);
			
		}
		
		System.out.println("--------- using switch --------");
		String weekday1 = null;
		
		switch (day) {
		
		case 1:
		       weekday1 = "Monday";
		       break;
		
		case 2:
			   weekday1 = "Tuseday";
			   break;
			   
		case 3:
			   weekday1 = "Wednesday";
			   break;
			   
		case 4:
			   weekday1 = "Thursday";
			   break;
			   
		case 5:
			   weekday1 = "Friday";
			   break;
			   
		case 6:
			   weekday1 = "Saturday";
			   break;
			   
		case 7:
			   weekday1 = "Sunday";
			   break;
			   
		}
		
		if (!weekday.equals("Invalid")) {
			System.out.println("Today is " + weekday1);
		
		}
			
		}

	}


