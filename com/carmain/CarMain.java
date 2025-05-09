package com.carmain;

import com.car.Car;

public class CarMain {
	public static void main(String[] args) {
		Car obj=new Car();
		obj.setCarDetails("Swift", "Maruti", 600000.0);
		obj.getCarDetails();
	}
}

