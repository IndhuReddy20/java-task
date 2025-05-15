package com.notdivisiableby4;

public class NotDivisible4{
	public int findNotDivisible4(int num){
		for(int i=1;i<=num;i++) {
            if (i%4!=0) {
                System.out.print(i+" ");
            }
		}
		return 0;
	}
	public static void main(String[] args) {
		NotDivisible4 obj=new NotDivisible4();
		obj.findNotDivisible4(100);
	}
}
