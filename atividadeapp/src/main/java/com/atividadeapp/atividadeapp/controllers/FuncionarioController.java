package com.atividadeapp.atividadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atividadeapp.atividadeapp.modells.Cliente;
import com.atividadeapp.atividadeapp.modells.Funcionario;
import com.atividadeapp.atividadeapp.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository fr;
	
	@RequestMapping(value="/cadastraFuncionario", method=RequestMethod.GET)
	public String form() {
		return "funcionario/formFuncionario";
	}
	
	@RequestMapping(value="/cadastraFuncionario", method=RequestMethod.POST)
	public String form(Funcionario funcionario) {
		
		fr.save(funcionario);
		
		return "redirect:/cadastraFuncionario";
	}
	
	

}
