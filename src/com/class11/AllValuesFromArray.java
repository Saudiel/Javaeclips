package com.class11;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] [] usa = {
				
				{ "Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax" },
				{ "Philly", "Strassburg", "Pitsburgh" },
				{ "Boston", "Quincy", "Springfield", "Burlington" },
				{ "Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara" },
				{ "Miami", "Orlando", "Tampa", "Tallahasee", },
				
		};
		
		System.out.println(usa.length); // 5
		
		System.out.println(usa[0].length); // 5 inside first array / columns in 1 row 
		
		System.out.println(usa[1].length); // 3 inside 2nd row / array 
		
		System.out.println(usa[2].length); // 4 inside 3rd row / array
		
		for (int r=0; r<usa.length; r++) { //iterates over rows
			
			for (int c=0; c<usa[r].length; c++) {
				System.out.println(usa [r] [c]);
				
			}
		}
}
}
	