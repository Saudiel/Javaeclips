package com.class06;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char gender = 'F';
		String description;
		
		switch (gender) {
		
		case 'M':
			description="Male";
			break;
			
		case 'F':
			description="Female";
			break;
			
			default:
				description = "N/A";
				
			
		}

		System.out.println(description);
		
	}

}
