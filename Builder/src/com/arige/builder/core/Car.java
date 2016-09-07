package com.arige.builder.core;

import com.example.toollibs.log.LogUtils;

public class Car {

	private final String TAG = getClass().getName();
	private String mAppearance_color;
	private String mHigh;

	public void showTheCar(){
		LogUtils.i(TAG, "arige the car is:");
		showAppearance();
		showHigh();
	}


	private void showAppearance(){
		LogUtils.i(TAG, "arige the appearance is:"+mAppearance_color);
	}
	
	private void showHigh(){
		LogUtils.i(TAG, "arige the high is:"+mHigh);
	}


	public void setmAppearance_color(String mAppearance_color) {
		this.mAppearance_color = mAppearance_color;
	}


	public void setmHigh(String mHigh) {
		this.mHigh = mHigh;
	}


	

	
	
	
}
