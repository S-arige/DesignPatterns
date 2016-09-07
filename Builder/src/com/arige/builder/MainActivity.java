package com.arige.builder;

import com.arige.builder.core.Boss;
import com.arige.builder.core.Car;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Boss boss = new Boss();
		Car car = boss.patsHead();
		car.showTheCar();
	}
}
