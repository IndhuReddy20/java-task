package com.divisibleby4or6;

public class Divisibleby4or6 {
	public int findDivisible(int num){
		 for (int i=1;i<=num;i++) {
	            if (i%4==0 || i%6==0) {
	                System.out.print(i+" ");
	            }
		 }return 0;
	}
	public static void main(String[] args) {
		Divisibleby4or6 obj=new Divisibleby4or6();
		obj.findDivisible(50);
	}

}
