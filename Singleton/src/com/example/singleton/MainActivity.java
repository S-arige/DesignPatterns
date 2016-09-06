package com.example.singleton;

import com.example.singleton.core.SingletonClass;
import com.example.singleton.core.SingletonHungerClass;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author arige
 * 很不错的一篇参考文章  http://cantellow.iteye.com/blog/838473
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SingletonClass.getInstance().print();
		SingletonHungerClass.getInstance().print();
	}
}
