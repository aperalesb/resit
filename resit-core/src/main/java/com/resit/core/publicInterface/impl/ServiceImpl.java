package com.resit.core.publicInterface.impl;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.BarObj;

public class ServiceImpl implements ServiceInterface {

	@Override
	public BarObj fooMethod(long bar) {
		BarObj obj = new BarObj();
		obj.setId(bar);
		obj.setName("name");
		return obj;
	}

}
