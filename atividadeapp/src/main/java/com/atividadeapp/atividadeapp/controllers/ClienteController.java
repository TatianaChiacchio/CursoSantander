package com.atividadeapp.atividadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atividadeapp.atividadeapp.modells.Cliente;
import com.atividadeapp.atividadeapp.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form() {
		return "cliente/formCliente";
	}
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Cliente cliente) {
		
		cr.save(cliente);
		return "redirect:/cadastrarCliente";
	}
	
	@RequestMapping("/clientes")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cliente> clientes = cr.findAll();
		mv.addObject("clientes", clientes);
		return mv;
	}
	
	

}
