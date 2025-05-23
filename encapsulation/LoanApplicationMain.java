package com.encapsulation;

public class LoanApplicationMain {
	public static void main(String[] args) {
		LoanApplication loanapp=new LoanApplication("Indhu",10000,500,2,230);
		loanapp.displayLoanDatails();
		System.out.println();
		System.out.println("-------After Updation----");
		System.out.println();
		LoanApplication loan=new LoanApplication("Indhu",20000,500,2,230);
		loan.displayLoanDatails();
	}
}
