package com.example.singleton.core;

import com.example.toollibs.log.LogUtils;


/**
 * @author arige
 * 懒汉模式
 */
public class SingletonClass {

	private final String TAG = getClass().getName();
	private SingletonClass(){
		
	}
	private static SingletonClass instance;
	//虽然每次都会锁定资源，影响整体的性能，但是这个方式可以保证完全的单例模式
	//这种懒汉模式保证了layz loading，只有在调用getInstance方法的时候，才会去初始化构造方法
	public static synchronized SingletonClass getInstance(){
		if(instance == null){
			instance = new SingletonClass();
		}
		return instance;
	}
	public void print(){
		LogUtils.i(TAG, "airge singleton layzman");
	}
}
