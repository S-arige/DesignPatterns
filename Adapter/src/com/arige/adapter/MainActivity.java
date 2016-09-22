package com.arige.adapter;

import com.arige.adapter.core.AdsAdapter;
import com.arige.adapter.core.SourceAdapter;
import com.arige.adapter.core.SourceClassOther;
import com.arige.adapter.core.SourceOtherAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SourceAdapter adapter = new SourceAdapter();
		print(adapter);
		SourceOtherAdapter classOther  = new SourceOtherAdapter();
		print(classOther);
	}

	private void print(AdsAdapter adapter){
		adapter.printInfo();
	}
	
}
