package com.arige.prototype.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepCopy implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JBean jb;
	private String id;
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public JBean getJb() {
		return jb;
	}


	public void setJb(JBean jb) {
		this.jb = jb;
	}

	public void setJbName(String name){
		if(jb != null){
			jb.setName(name);
		}
	}
	
	public String getJbName(){
		if(jb != null){
			return jb.getName();
		}
		return null;
	}
	
	public void setJbId(int num){
		if(jb != null){
			jb.setNum(num);
		}
	}
	
	public int getJbNun(){
		if(jb != null){
			return jb.getNum();
		}
		return 0;
	}
	
	/**
	 * 实现带对象的浅拷贝
	 */
	public DeepCopy clone(){
		DeepCopy copy = null;
		try {
			copy = (DeepCopy) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copy;
	}

	/**
	 * 实现深拷贝，需要注意的是，拷贝的对象和原型对象都要是可序列化的，否则无法正常运行
	 * @return
	 */
	public Object deepClone() {
		try {
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(bo);
			oo.writeObject(this);

			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi = new ObjectInputStream(bi);
			return oi.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
