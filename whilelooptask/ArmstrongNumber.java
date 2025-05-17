package com.armstrong;

public class ArmstrongNumber {
	public int findArmstrongNumber(int num) {
		if(num>=100 && num<=999) {
		int temp=num;
		int sum=0;
		int rev=0;
		while(num!=0) {
			rev=(num%10);
			//System.out.println(rev*rev*rev);
			sum=sum+(rev*rev*rev);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(sum+" is an Armstrong Number.");
		}
		else {
			System.out.println(sum+" is not an Armstrong Number");
		}
		}
	return 0;
	}
	public static void main(String[] args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.findArmstrongNumber(153);
	}

}
