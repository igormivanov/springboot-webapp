package com.estudo.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.estudo.springweb.models.Administrador;
import com.estudo.springweb.repository.AdministradoresRepository;

@Controller
public class AdministradoresController {
	
	@Autowired
	private AdministradoresRepository administradoresRepository;
	
	@GetMapping("/administradores")
	public String index(Model model) {
		List<Administrador> administradores = (List<Administrador>) administradoresRepository.findAll();
		model.addAttribute("administradores", administradores);
		return "administradores/index";
	}
}
