package com.arige.adapter.core;

import com.example.toollibs.log.LogUtils;

public class SourceClass {

	private String TAG = getClass().getName();

	public void output(){
		LogUtils.i(TAG , "adapter source output");
	}
	
}
