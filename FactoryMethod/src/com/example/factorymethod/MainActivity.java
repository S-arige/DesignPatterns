package com.example.factorymethod;

import com.example.factorymethod.core.ISendInfo;
import com.example.factorymethod.core.SendMessageFactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button btn_simple_mail;
	private Button btn_simple_sms;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		setListener();
	}
	
	private void initView(){
		btn_simple_mail = (Button) findViewById(R.id.factory_simple_mail);
		btn_simple_sms = (Button) findViewById(R.id.factory_simple_sms);
	}

	private void setListener(){
		btn_simple_mail.setOnClickListener(this);
		btn_simple_sms.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		int id = v.getId();
		SendMessageFactory factory = new SendMessageFactory();
		if(id == R.id.factory_simple_mail){
			ISendInfo info = factory.produce(SendMessageFactory.SEND_TYPE_MAIL);
			info.send("come form mail");
		}
		if(id == R.id.factory_simple_sms){
			ISendInfo info = factory.produce(SendMessageFactory.SEND_TYPE_SMS);
			info.send("come form sms");
		}
	}
}
