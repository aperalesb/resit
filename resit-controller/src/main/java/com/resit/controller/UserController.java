package com.resit.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.resit.common.constants.ControllerParamConstants;

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
	@RequestMapping(method = RequestMethod.GET, value = "/home.do")
	public ModelAndView loadHome(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView resultView = new ModelAndView("home");
		
		resultView.addObject("name", "Amin Abu-Taleb");

		return resultView;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/public/registerUser.do")
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response, 
			@RequestParam(value="user_name", required=true) String userName,
			@RequestParam(value="user_email", required=true) String userEmail,
			@RequestParam(value="user_password", required=true) String userPassword
			) {
		
		//TODO Implementar registro
		
		ModelAndView resultView = new ModelAndView("public/register");
		
//		resultView.addObject("registerOk", Boolean.TRUE);
		
		resultView.addObject("registerOk", Boolean.FALSE);
		resultView.addObject("registerError", "Se ha producido un error en el registro");

		return resultView;
	}
}
