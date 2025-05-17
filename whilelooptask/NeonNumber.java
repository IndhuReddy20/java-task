package com.neon;

public class NeonNumber {
	
	public int findNeonNumber(int num) {
		if(num<=0) {
			System.out.println("Not a NeonNumber");
		}
		int temp=num;
		int square=num*num;
		int sum=0;
		while(square!=0) {
			sum=sum+(square%10);
			square=square/10;
		}
		if(temp==sum) {
			System.out.println(sum+" "+"is a Neon Number.");
		}else {
			System.out.println(sum+"is not a Neon Number.");
		}
			
		return 0;	
	}
	public static void main(String[] args) {
		NeonNumber obj=new NeonNumber();
		obj.findNeonNumber(9);
	}

}
