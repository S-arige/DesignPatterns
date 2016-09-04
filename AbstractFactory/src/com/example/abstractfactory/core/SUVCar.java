/**
 * 
 */
package com.example.abstractfactory.core;

import com.example.toollibs.log.LogUtils;

/**
 * @author songjunjun
 * 2016年9月4日
 */
public class SUVCar implements ICar {

	private final String TAG = getClass().getName();

	/* (non-Javadoc)
	 * @see com.example.abstractfactory.core.ICar#run()
	 */
	@Override
	public void run() {
		LogUtils.i(TAG, "放肆奔跑");

	}

}
