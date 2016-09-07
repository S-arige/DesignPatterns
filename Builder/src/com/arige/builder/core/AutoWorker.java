package com.arige.builder.core;

public class AutoWorker implements Ibuilder {

	private Car mCar = new Car();

	@Override
	public Car getCar() {
		return mCar;
	}

	@Override
	public void making(String appearance_color, String high) {
		mCar.setmHigh(high);
		mCar.setmAppearance_color(appearance_color);
		
	}

}
