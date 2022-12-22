package com.estudo.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministradoresController {
	
	@GetMapping("/administradores")
	public String index() {

		return "administradores/index";
	}
}
