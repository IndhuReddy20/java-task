package com.table6;

public class Table6 {
	public int getTable6(int num) {
		for(int i=10;i>=1;i--) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		return 0;
	}
	public static void main(String[] args) {
		Table6 obj=new Table6();
		obj.getTable6(6);
	}

}
