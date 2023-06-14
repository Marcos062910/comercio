package com.itb.inf2fm.comercio.controller;




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

  


@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String ListarProdutos() {
		
		Produto p1 = new Produto();
			p1.setId(20l);
			p1.setNome("Maquina de Lavar Brastemp 15 L");
			p1.setCodigoBarras("123456789");
			p1.setDescricao("Produto Linha Branca com painel digital ");
			p1.setPreco(3215.89);
			
			Produto p2 = new Produto();
			p2.setId(20l);
			p2.setNome("televisor");
			p2.setCodigoBarras("12398765");
			p2.setDescricao("televisor tela plana let sansug ");
			p2.setPreco(3147.89);
			
			// Adicionar os produtos á lista
			
						listaDeProdutos.add(p1);
			
			return "produtos"; 
			
			
	
	}

}
