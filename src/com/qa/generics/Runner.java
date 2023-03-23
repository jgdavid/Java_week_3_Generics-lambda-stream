package com.qa.generics;

public class Runner {
	public static void main(String[] args) {

		VehicleContainer<Car> vc = new VehicleContainer<>();

		vc.setV(new Car());

		Car c = vc.getV();
	}
}
