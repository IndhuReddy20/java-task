package com.bankmain;

import com.bank.Bank;

public class BankMain {
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setAccountDetails("Rahul", 123456, 5000.0);
		obj.getAccountDetails();
		
	}
	

}
