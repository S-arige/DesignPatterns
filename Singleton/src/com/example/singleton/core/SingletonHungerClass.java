package com.example.singleton.core;

import com.example.toollibs.log.LogUtils;

/**
 * @author songjunjun
 *饿汉模式
 *
 *该模式也可以保证线程的安全，但是没有实现layz loading
 */
public class SingletonHungerClass {

	private final String TAG = getClass().getName();
	private static SingletonHungerClass instance = new SingletonHungerClass();
	private SingletonHungerClass(){}
	public static SingletonHungerClass getInstance(){
		return instance;
	}
	
	public void print(){
		LogUtils.i(TAG, "arige singleton hungerman");
	}
}
