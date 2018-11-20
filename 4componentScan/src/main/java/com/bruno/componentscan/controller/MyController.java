package com.bruno.componentscan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	@ResponseBody //retorna ola
	public String hello() {
		System.out.println("Entrada no método");
		return "Olá";
	}
	
	

}
