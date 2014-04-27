package br.com.ekomasi.teste;

import br.com.ekomasi.dao.EnderecoDAO;
import br.com.ekomasi.modelo.Endereco;

public class TesteAdicionaEndereco {
	//faz a criacao da tabela e testa o insert
	
	public static void main(String[] args) {
		
		Endereco endereco = criaEndereco();
		
		new EnderecoDAO().adiciona(endereco);
		
	}

	private static Endereco criaEndereco() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Teste");
		endereco.setNumero("999");
		endereco.setBairro("Teste");
		endereco.setMunicipio("Teste");
		endereco.setUf("SP");
		endereco.setPais("Brasil");
		endereco.setCep("00000-000");
		endereco.setComplemento("XXX");
		return endereco;
	}

}
