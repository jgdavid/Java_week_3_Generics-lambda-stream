package com.qa.generics;

public class VehicleContainer<T extends Vehicle> {

	private T v;

	public T getV() {
		return v;
	}

	public void setV(T v) {
		this.v = v;
	}

}
