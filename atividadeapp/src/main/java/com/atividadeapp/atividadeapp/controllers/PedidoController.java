package com.atividadeapp.atividadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atividadeapp.atividadeapp.modells.Pedido;
import com.atividadeapp.atividadeapp.repository.PedidoRepository;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository pr;
	
	@RequestMapping(value="/cadastrarPedido", method=RequestMethod.GET)
	public String form() {
		return "pedido/formPedido";
		
	}
	
	@RequestMapping(value="/cadastrarPedido", method=RequestMethod.POST)
	public String form(Pedido pedido) {
		
		pr.save(pedido);
		return "redirect:/cadastrarPedido";
		
	}

}
