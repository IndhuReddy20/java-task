package com.divisible3and5;

public class Divisible3and5 {
	public int divisible(int num) {
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i);
				if(i<90) {
					System.out.print(","+" ");
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Divisible3and5 obj=new Divisible3and5();
		obj.divisible(100);
	}

}
