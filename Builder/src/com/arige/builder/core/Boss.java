package com.arige.builder.core;

public class Boss {

	private AutoWorker worker = new AutoWorker();
	public Car patsHead(){
		worker.making("red", "179cm");
		return worker.getCar();
	}
	
	
}
