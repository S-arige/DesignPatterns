/**
 * 
 */
package com.example.abstractfactory.core;

/**
 * @author songjunjun
 * 2016年9月4日
 */
public class CUVFactory implements IProvider {

	/* (non-Javadoc)
	 * @see com.example.abstractfactory.core.IProvider#produce()
	 */
	@Override
	public ICar produce() {
		
		return new CUVCar();
	}

}
