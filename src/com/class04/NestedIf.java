package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean anyAllergy = true;
		boolean pollenAllergy = true;
		
		
		if(anyAllergy) {
			System.out.println("Let's check which allergies you have");
			
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
			}else {
				System.out.println("Ok I know you do not have pollen allergy");
				
			}
			
		}else {
			System.out.println("You are lucky not having any allergies");
		}
		
		System.out.println("----------------Example02----------------");
		
		boolean isFriday = true;
		int day = 13;
		
		if(isFriday) {
			System.out.println("I it is a movie day !!!");
			
			if(day==13) {
				System.out.println("I will watch a scary movie");
			}else { 
				System.out.println("I will watch any available movie");
				
			}
			
		}else { 
			System.out.println("I will stay at home and study Java");
			
	
		}
		
		System.out.println("----------------Example02----------------");
		
		/*  check if complete
		 *  check score only if complete
		 *  add message to complete
		 */

		boolean completed = true;
		int score = 90;
		
		if(completed) {
			
			if (score>90) {
				System.out.println("Great Job");
			}else if (score>80 ){ 
				System.out.println("good job");
			}else if (score>70 ) {
				System.out.println("Good, but lets try to do better");
			}else {
				System.out.println("Good for trying, but study more !!!");	
			}
			System.out.println("Please make sure to complete all assignment on time");
		}
		
		System.out.println("----------------Example03----------------");
		
		boolean morning = true;
		
		boolean classToday = true;
		
		if(morning) {
			System.out.println("I am going to work");
			
		}else { 
			System.out.println("Let me check if i have a class today");
			
			if(classToday) {
				System.out.println("I will attend class at sytax");
			}else {
				System.out.println("I can relax");
			}
		}
	}

}
