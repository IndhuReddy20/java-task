package com.even1to50;

public class Even {
	public int findEven(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);
		return 0;
	}
	public static void main(String[] args) {
		Even obj=new Even();
		obj.findEven(50);
	}

}
