package com.class13;

public class Dogs {

	public String breed;
	
	public String size;
	
	public String color;
	
	public int age;
	
	public void bark() {
	
	System.out.println("ruf ruf and wow wow wow");
	
	}
	
	public void sleep() {
		
	System.out.println("ZZZzzzZZZzzz...");
		
	}
	
	public void eat() {
		
		for(int i=0; i<5; i++)
		
		System.out.println("eating......");
			
		}
	
    public void look() {
		
		System.out.println("Hi i am a dog my color is " + color);
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Dogs bulldog=new Dogs();
			
			bulldog.breed="Bulldog";
			
			bulldog.size="Large";
			
			bulldog.color="Gray";
			
			bulldog.age=5;
			
			bulldog.bark();
			
			bulldog.sleep();
			
			bulldog.eat();
			
			bulldog.look();
			
			
			
         Dogs beagle=new Dogs();
			
			beagle.breed="Beagle";
			
			beagle.size="Large";
			
			beagle.color="Orange";
			
			beagle.age=6;
			
			beagle.look();
			
			
			
		 Dogs husky=new Dogs();
				
			husky.breed="Husky";
				
			husky.size="Large";
				
			husky.color="Black";
				
			husky.age=9;
		
	}

}
