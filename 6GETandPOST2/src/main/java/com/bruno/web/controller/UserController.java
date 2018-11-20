package com.bruno.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bruno.web.entities.User;

@Controller
public class UserController {
	
	/*Acessa via GET o getUser, atribui o objecto user ao user.html
	 * depois é inviado via método POST que cai no @Postmapping e retorna o result
	 * 
	 *
	 * Formulario acessado via GET e envia o nome do user via post 
	 */
	
	//localhost:8080/user
	@GetMapping("/user") 
	public String getUser(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user";		
	}
	
	@PostMapping("/user") 
	public String userSubmit(@ModelAttribute User user) {
		return "result";
	}
}
