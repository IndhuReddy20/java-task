package com.encapsulation;

public class FixedDepositMain {
	public static void main(String[] args) {
		FixedDepositAmount fdamount=new FixedDepositAmount("Indhu",200000,1000,1,2500);
		System.out.println(fdamount.calculateMaturityAmount());
		fdamount.withdrawBeforeMaturity(25);
	}
}
