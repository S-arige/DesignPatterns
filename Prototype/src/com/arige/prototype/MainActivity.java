package com.arige.prototype;

import com.arige.prototype.core.DeepCopy;
import com.arige.prototype.core.JBean;
import com.arige.prototype.core.ShallowCopy;
import com.example.toollibs.log.LogUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private ShallowCopy copy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ShallowCopy();
		ShallowCopyWithObject();
		deepCopyWithObject();
	}

	/**
	 * 这个是浅复制，只复制变量不复制对象
	 */
	private void ShallowCopy(){
		ShallowCopy date = new ShallowCopy();
		date.setId("1");
		try {
			copy = date.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LogUtils.i("prototype", "prototype  before modify:"+"data:"+date.getId()+"//copy:"+copy.getId());
		copy.setId("2");
		LogUtils.i("prototype", "prototype  end modify:"+"data:"+date.getId()+"//copy:"+copy.getId());
	}
	
	/**
	 * 带对象的浅拷贝；
	 * 和方法 deepCopyWithObject 一起，可以看出深拷贝和浅拷贝的区别
	 */
	private void ShallowCopyWithObject(){
		DeepCopy mOldCopy = new DeepCopy();
		mOldCopy.setId("1");
		JBean jb = new JBean();
		jb.setName("jb_name_1");
		mOldCopy.setJb(jb);
		
		
		DeepCopy mNewCopy = mOldCopy.clone();
		LogUtils.i("prototype", "prototype  before modify:"+"//Old: id"+mOldCopy.getId()+"/t jb_name:"+mOldCopy.getJb().getName()
				+"/n new: id "+mNewCopy.getId()+"/t --jb_name: "+mNewCopy.getJb().getName());
		
		mNewCopy.setId("2");
		mNewCopy.getJb().setName("jb_name_2");
		
		LogUtils.i("prototype", "prototype  end modify:"+"//Old:id"+mOldCopy.getId()+"/t --jb_name:"+mOldCopy.getJb().getName()
				+"/n new:id "+mNewCopy.getId()+"/t --jb_name: "+mNewCopy.getJb().getName());
	}
	
	/**
	 * 带对象的深拷贝
	 */
	private void deepCopyWithObject(){
		DeepCopy mOldCopy = new DeepCopy();
		mOldCopy.setId("1");
		JBean jb = new JBean();
		jb.setName("jb_name_1");
		mOldCopy.setJb(jb);
		
		
		DeepCopy mNewCopy = (DeepCopy) mOldCopy.deepClone();
		
		LogUtils.i("prototype", "prototypeDeepCopy  before modify:"+"//Old: id"+mOldCopy.getId()+"/t jb_name:"+mOldCopy.getJb().getName()
				+"/n new: id "+mNewCopy.getId()+"/t --jb_name: "+mNewCopy.getJb().getName());
		
		mNewCopy.setId("2");
		mNewCopy.getJb().setName("jb_name_2");
		
		LogUtils.i("prototype", "prototypeDeepCopy   end modify:"+"//Old:id"+mOldCopy.getId()+"/t --jb_name:"+mOldCopy.getJb().getName()
				+"/n new:id "+mNewCopy.getId()+"/t --jb_name: "+mNewCopy.getJb().getName());
	}
}
