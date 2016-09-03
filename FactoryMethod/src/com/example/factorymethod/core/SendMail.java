package com.example.factorymethod.core;

import com.example.toollibs.log.LogUtils;

public class SendMail implements ISendInfo {

	private  String TAG = this.getClass().getName();;

	@Override
	public void send(String message) {
		LogUtils.e(TAG, "send mail:"+message);
	}

}
