package com.vbera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value={"index","welcome"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
