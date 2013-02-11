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

/**
 * Servicio publicado para el vendedor 
 */

@Controller
public class RetailerService {

	private static final Logger LOG = Logger.getLogger(RetailerService.class);

	ServiceInterface serviceInterface = new ServiceImpl();

	@RequestMapping(value = "/{companyCode}/saveReceipt", method = RequestMethod.POST)
	@ResponseBody
	 public BarObj saveReceipt(@PathVariable("companyCode") long companyCode) throws Exception {
		LOG.info("Getting request from : " + companyCode);

	  return serviceInterface.fooMethod(companyCode);
	 }

}
