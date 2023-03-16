package br.fiap.app.exemplo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.exemplo.models.Categoria;
import br.fiap.app.exemplo.models.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutosController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("produto/index");
		List<Produto> listaProduto = new ArrayList<Produto>();

		Produto produtoUm = new Produto();
		produtoUm.setId(new Long(1));
		produtoUm.setNome("Nike Lebrom");

		Produto produtoDois = new Produto();
		produtoDois.setId(new Long(2));
		produtoDois.setNome("Nike do Naldo");

		listaProduto.add(produtoUm);
		listaProduto.add(produtoDois);

		model.addObject("produtos", listaProduto);
		return model;
	}

	@GetMapping("/edit/{id}")
	public String getById(Model model, @PathVariable("id") Integer idProduto) {
		model.addAttribute("idProduto", idProduto);
		return "produto/edit";
	}

	@GetMapping("/create")
	public String create() {
		return "produto/create";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute("produto") Produto objProduto) {
		// enviar para base de dados
		System.out.println(objProduto.getId());
		System.out.println(objProduto.getNome());
		return "redirect:/produto";
	}

	@GetMapping("/categoria")
	@ResponseBody
	public Categoria getCategoria() {
		Categoria categoria = new Categoria();
		categoria.setDescricao("Tênis");
		categoria.setId(1);
		return categoria;
	}

}
