package com.multiples7;

public class Multiplesof7 {
	public int multiple(int num) {
		for(int i=1;i<=10;i++) {
			System.out.print(num*i+" ");
		}
		return 0;
	}
	public static void main(String[] args) {
		Multiplesof7 obj=new Multiplesof7();
		obj.multiple(7);
	}

}
