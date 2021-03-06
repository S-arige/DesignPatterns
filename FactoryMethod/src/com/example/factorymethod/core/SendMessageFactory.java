package com.example.factorymethod.core;

public class SendMessageFactory {

	public static String SEND_TYPE_SMS = "sms";
	public static String SEND_TYPE_MAIL = "mail";
	
	public ISendInfo produce(String type){
		if(SEND_TYPE_SMS.equals(type)){
			return new SendSMS();
		}else if(SEND_TYPE_MAIL.equals(type)){
			return new SendMail();
		}else{
			throw new ClassFormatError("can't find the type:"+type);
		}
		
		
	}
}
