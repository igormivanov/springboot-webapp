package com.estudo.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/administradores/novo")
	public String novo() {
		return "administradores/novo";
	}
	
	@PostMapping("/administradores/criar")
	public String criar(Administrador administrador) {
		administradoresRepository.save(administrador);
		return "redirect:/administradores";
	}
	
	@GetMapping("/administradores/{id}/excluir")
	public String excluir(@PathVariable int id) {
		administradoresRepository.deleteById(id);
		return "redirect:/administradores";
	}
}
