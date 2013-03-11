package com.resit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author amin
 */

@Controller
public class NavigationController {
	
	@RequestMapping("index.do")
	public ModelAndView index(){
		return new ModelAndView("index");
	}

	@RequestMapping("public/support.do")
	public ModelAndView support(){
		return new ModelAndView("public/support");
	}
	
	@RequestMapping("public/register.do")
	public ModelAndView register(){
		return new ModelAndView("public/register");
	}
}
