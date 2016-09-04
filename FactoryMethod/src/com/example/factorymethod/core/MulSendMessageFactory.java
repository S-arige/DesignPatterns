package com.example.factorymethod.core;

/**
 * 每个子类，一个生成方法
 * @author songjunjun
 *
 */
public class MulSendMessageFactory {

	/**
	 * 生成新的mail的发送方法
	 * @return
	 */
	public SendMail produceMail(){
		return new SendMail();
	}
	/**
	 * 生成新的sms的发送方法
	 * @return
	 */
	public SendSMS produceSMS(){
		return new SendSMS();
	}
}
