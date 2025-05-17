package com.factorialnum;

public class FacorialNumber {
	public int findFactorial(int num) {
		int product=1;
		int i=1;
		while(i<=num) {
			product=product*i;
			i++;
		}
		System.out.println("Factorial of "+num+" is "+product);
		return product;	
	}
	public static void main(String[] args) {
		FacorialNumber obj=new FacorialNumber();
		obj.findFactorial(7);
	}

}
