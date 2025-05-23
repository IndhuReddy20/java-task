package com.encapsulation;

public class CreditCardMain {
	public static void main(String[] args) {
		CreditCardAmount amt=new CreditCardAmount("Indhu",100000,2500,2);
		amt.swipeCard(75000);
		amt.makePayment(20000);
		amt.applyInterest();
	}
}
