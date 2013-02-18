package com.resit.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.Receipt;
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
	 public Receipt saveReceipt(@PathVariable("companyCode") String companyCode) throws Exception {
		LOG.info("Saving receipt : " + companyCode);

	  return serviceInterface.saveReceipt(companyCode);
	 }
	
	@RequestMapping(value = "/{companyCode}/getReceipt", method = RequestMethod.POST)
	@ResponseBody
	 public Receipt getReceipt(@PathVariable("companyCode") String companyCode, 
			 @RequestParam("receiptCode") String receiptCode) throws Exception {
		LOG.info("Getting receipt: " + companyCode + ": " + receiptCode);

	  return serviceInterface.getReceipt(companyCode, receiptCode);
	 }

}
