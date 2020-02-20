package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WebController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(){

		return "index";
	}
	
}
