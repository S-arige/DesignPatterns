package com.example.factorymethod.core;

import com.example.toollibs.log.LogUtils;

public class SendSMS implements ISendInfo {

	private  String TAG = getClass().getName();

	@Override
	public void send(String message) {
		LogUtils.e(TAG, "send sms:"+message);

	}

}
