
package com.bruno.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bruno.api.service.UserService;

//Receber os dados e enviar 

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/*Não é necessário o construtor porque se usou o Autowired
	 * public UserController(UserRepository userRepository) { this.userRepository =
	 * userRepository; }
	 */

	// tem de se criar um ficheiro html com o nome user
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userService.findAll());
		return "user";
	}

}
