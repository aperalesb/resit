package com.resit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.resit.common.ControllerParamConstants;

/**
 * @author amin
 */
@Controller
public class UserController {
	
	private final static Logger LOG = Logger.getLogger(UserController.class);
	
	/**
	 * 
	 * @param eMail
	 * @param password
	 * @param request
	 * @param response
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/login.do")
	public ModelAndView login(
			@RequestParam(required = true, value = ControllerParamConstants.LOGIN_EMAIL) String eMail,
			@RequestParam(required = true, value = ControllerParamConstants.LOGIN_PASSWORD) String password,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView resultView = new ModelAndView("index");
		LOG.info(String.format("Autenticando al usuario %s", eMail));
		
		if (eMail != null && password != null && eMail.equals("heavywizard@gmail.com") && password.equals("amin")){
			//Fake result
			resultView = new ModelAndView("home");
			resultView.addObject("name", "Amin");
		}
		
		return resultView;
	}
}
