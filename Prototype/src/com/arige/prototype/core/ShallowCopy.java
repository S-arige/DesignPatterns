package com.arige.prototype.core;

public class ShallowCopy implements Cloneable {

	
	private String mId;
	
	public ShallowCopy clone() throws CloneNotSupportedException{
		ShallowCopy shallowCopy  = (ShallowCopy) super.clone();
		return shallowCopy;
		
	}
	
	public void setId(String id){
	
		mId = id;
	}
	
	public String getId(){
		return mId;
	}
}
