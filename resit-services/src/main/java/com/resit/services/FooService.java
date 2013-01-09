package com.resit.services;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.BarObj;
import com.resit.core.publicInterface.impl.ServiceImpl;
import com.resit.services.beans.BarObjJSON;

@Controller
public class FooService {

	private static final String DATA_FIELD = "data";
	private static final Logger logger_c = Logger.getLogger(FooService.class);

	ServiceInterface serviceInterface = new ServiceImpl();

	@RequestMapping(value = { "/rest/resit/" }, method = { RequestMethod.POST })
	public ModelAndView bar(@RequestBody BarObjJSON obj,
			HttpServletResponse httpResponse_p, WebRequest request_p) {

		BarObj coreObj;
		logger_c.debug("Creating Obj: " + obj.toString());

		coreObj = serviceInterface.fooMethod(obj.getName());

		/* set HTTP response code */
		httpResponse_p.setStatus(HttpStatus.CREATED.value());

		/* set location of created resource */
		httpResponse_p.setHeader("Location", request_p.getContextPath()
				+ "/rest/funds/" + obj.getName());

		/**
		 * Return the view
		 */
		return new ModelAndView("jsonRes", DATA_FIELD, coreObj);
	}
}
