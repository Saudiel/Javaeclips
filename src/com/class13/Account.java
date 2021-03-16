package com.class13;

public class Account {

	String username;
	
	String password;
	
	double balance;
	
	String accountnumber;
	
	boolean isloggedin;
	
	public void login(String username,String password) {
		
		if (username.equals("Yulia") && password.equals("pass123")) {
			
			System.out.println("Welcome to bank of America your balance is " + balance);
			
		}else {
			
			System.out.println("Username or password is not correct");
			
		}
		
	}
	
	public void printInfo() {
		
		if (isloggedin) {
			
			System.out.println("Your Account number is " + accountnumber + " Your balance is " + balance);
			
		}
		
	}
	
	public void printUsernameAndPassword(String Username, String Password) {
	
	System.out.println("Username + Password");
	
	if (username.equals("Bryan")) {
		
		System.out.println("Hi Bryan");
		
	}else {
		
		System.out.println("By Bryan");
		
	}
	
	}
	
}
