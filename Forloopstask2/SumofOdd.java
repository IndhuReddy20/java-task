package com.sumofodd;

public class SumofOdd {
	public int sumofOdd(int num) {
		int sum = 0;
		for(int i=1;i<=num;i=i+2) {
			sum+=i;
			System.out.print(i);
			if(i<29) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum);
		return sum;
	}

	public static void main(String[] args) {
		SumofOdd obj=new SumofOdd();
		obj.sumofOdd(30);
	}

}
