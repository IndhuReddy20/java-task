package com.divisibleby9;

public class Divisibleby9 {
	public int countDivisibleby9(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(i%9==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Numbers are:"+count);
		return 0;
	}
	public static void main(String[] args) {
		Divisibleby9 obj=new Divisibleby9();
		obj.countDivisibleby9(100);
	}
}