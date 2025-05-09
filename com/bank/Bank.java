package com.bank;

public class Bank {
	private String accountHolder;
	private int accountNumber;
	private double balance;

	public void setAccountDetails(String holder, int accNum, double bal) {

		accountHolder = holder;
		accountNumber = accNum;
		balance = bal;
	}
	public void getAccountDetails() {
		System.out.println("Account Holder      : " + accountHolder);
		System.out.println("Account Number      : " + accountNumber);
		System.out.println("Balance             : " + balance);
	}

}
