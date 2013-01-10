package com.resit.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.BarObj;
import com.resit.core.publicInterface.impl.ServiceImpl;

@Controller
public class FooService {

	private static final Logger logger_c = Logger.getLogger(FooService.class);

	ServiceInterface serviceInterface = new ServiceImpl();

	@RequestMapping(value = "/{companyCode}/bar", method = RequestMethod.POST)
	@ResponseBody
	 public BarObj bar(@PathVariable("companyCode") long companyCode) throws Exception {
		logger_c.info("Getting code: " + companyCode);

	  return serviceInterface.fooMethod(companyCode);
	 }

}
