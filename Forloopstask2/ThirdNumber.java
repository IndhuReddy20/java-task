package com.thirdnumber;

public class ThirdNumber {
	public int findThirdNumber(int num) {
        for(int i=5;i<num;i=i+3){
            System.out.print(i+" ");
        }
        return 0;
	}
	public static void main(String[] args) {
		ThirdNumber obj=new ThirdNumber();
		obj.findThirdNumber(50);
	}
}
