package br.com.ekomasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




import br.com.ekomasi.dao.PessoaDAO;
import br.com.ekomasi.modelo.Endereco;
import br.com.ekomasi.modelo.Pessoa;

@Controller
public class PessoaController {
	
	@RequestMapping("pessoa")
	public String form(){
		return "usuario/formPessoa";
	}
	
	@RequestMapping("adicionaPessoa")
	public String adiciona(Pessoa pessoa) {
		PessoaDAO dao = new PessoaDAO();
		dao.adiciona(pessoa);
		return "usuario/pessoaAdicionada";
	}
	
	@RequestMapping("lista")
	public String listar(){
		return "usuario/listaPessoas";
	}
	

}
