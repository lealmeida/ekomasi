package br.com.ekomasi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ekomasi.dao.EnderecoDAO;
import br.com.ekomasi.modelo.Endereco;

@Controller
public class EnderecoController {
	
	@RequestMapping("novoEndereco")
	public String form() {
		return "endereco/formulario";
	}
	
	@RequestMapping("adicionaEndereco")
	public String adiciona(Endereco endereco) {
		EnderecoDAO dao = new EnderecoDAO();
		dao.adiciona(endereco);
		return "endereco/adicionado";
	}
}
