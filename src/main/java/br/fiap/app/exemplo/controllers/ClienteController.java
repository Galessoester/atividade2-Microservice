package br.fiap.app.exemplo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.exemplo.models.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("cliente/index");
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente("Ester", 24, 12345);
		Cliente cliente2 = new Cliente("Alice", 21, 57890);
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		model.addObject("clientes", listaCliente);
		return model;

	}

}
