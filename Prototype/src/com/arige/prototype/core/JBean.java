package com.arige.prototype.core;

import java.io.Serializable;

public class JBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3382147965519082307L;
	private String name;
	private int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
