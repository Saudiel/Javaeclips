package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Variable day
		 * 
		 * If day is Tuesday or Wednesday --> manual class
		 * If day is Monday or Friday --> no class
		 * If day is Saturday or Sunday --> Java class 
		 * if day is Thursday --> review class
		 * 
		 */

		String day = "Mondqay";
		
		if (day.equals("Monday") || day.equals("Friday")) { 
			System.out.println("Today i have no class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) { 
				System.out.println("Today i have manual class");	 
		}else if (day.equals("Thursday")) { 
					System.out.println("Today I have review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) { 
			System.out.println("Today i have Java class");
		}else {
			System.out.println(day + " Day is invalid");
				
		}
		
	}

}
