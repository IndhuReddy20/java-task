package com.cubes;

public class CubesofNumber {
	public int findCubes(int num){
		for (int i=1;i<=num;i++) {
            System.out.println(i+"^3 = "+(i*i*i));
		}
		return 0;
	}	
	public static void main(String[] args) {
		CubesofNumber obj=new CubesofNumber();
		obj.findCubes(10);
	} 

}
