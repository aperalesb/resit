package com.resit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author amin
 */

@Controller
@RequestMapping("/foo")
public class FooController {
	
	@RequestMapping("bar.do")
	public ModelAndView bar(){
		return new ModelAndView("bar");
	}
}
