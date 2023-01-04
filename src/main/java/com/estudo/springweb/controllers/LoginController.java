package com.estudo.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.estudo.springweb.models.Administrador;
import com.estudo.springweb.repository.AdministradoresRepository;

@Controller
public class LoginController {
	
	@Autowired
	private AdministradoresRepository administradoresRepository;
	
	@GetMapping("/login")
	public String index() {	
		return "login/index";
	}
	
	@PostMapping("/logar")
	public String logar(Model model, Administrador admParam, String lembrar) {
		Administrador adm = this.administradoresRepository.Login(admParam.getEmail(), admParam.getSenha());
		if(adm != null) {
			return "redirect:/";
		}
		
		model.addAttribute("erro", "Usuário ou senha inválidos");
		return "login/index";
		
	}
}
