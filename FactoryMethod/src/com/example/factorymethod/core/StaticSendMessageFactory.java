package com.example.factorymethod.core;

/**
 * 这个类是静态工厂方法的
 * @author songjunjun
 *
 */
public class StaticSendMessageFactory {

	public static SendMail produceSendMail(){
		return new SendMail();
	}
	
	public static SendSMS produceSMS(){
		return new SendSMS();
	}
}
