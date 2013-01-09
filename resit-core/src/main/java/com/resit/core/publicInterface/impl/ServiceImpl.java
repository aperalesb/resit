package com.resit.core.publicInterface.impl;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.BarObj;

public class ServiceImpl implements ServiceInterface {

	@Override
	public BarObj fooMethod(String bar) {
		BarObj obj = new BarObj();
		obj.setId(1);
		obj.setName(bar);
		return obj;
	}

}
