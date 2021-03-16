package com.class13;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ghulamsAccount=new Account();
		
		ghulamsAccount.accountnumber="123";
		
		ghulamsAccount.username="ghulam123";
		
		ghulamsAccount.password="pass123";
		
		ghulamsAccount.balance=1400;
		
		//ghulamsAccount.login("Ghulam123", "pass123");
	
		ghulamsAccount.printUsernameAndPassword("Bryan", "Ahmed123");
		
	}

}
