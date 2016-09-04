package com.example.abstractfactory;

import com.example.abstractfactory.core.CUVFactory;
import com.example.abstractfactory.core.ICar;
import com.example.abstractfactory.core.IProvider;
import com.example.abstractfactory.core.SUVCar;
import com.example.abstractfactory.core.SUVFactory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button btn_suv;
	private Button btn_cuv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		setListener();
		
	}
	
	private void initView(){
		btn_suv = (Button) findViewById(R.id.btn_suv);
		btn_cuv = (Button) findViewById(R.id.btn_cuv);
	}
	
	
	private void setListener(){
		btn_cuv.setOnClickListener(this);
		btn_suv.setOnClickListener(this);
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_cuv:
			IProvider CUVprovider = new CUVFactory();
			ICar CUVcar = CUVprovider.produce();
			CUVcar.run();
			break;

		case R.id.btn_suv:
			IProvider SUVprovider = new SUVFactory();
			ICar SUVcar = SUVprovider.produce();
			SUVcar.run();
			break;
		}
	}
	
	
}
