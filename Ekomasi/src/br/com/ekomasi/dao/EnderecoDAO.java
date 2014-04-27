package br.com.ekomasi.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ekomasi.modelo.Endereco;
import br.com.ekomasi.util.CreateSession;

public class EnderecoDAO {
	
	private final Session session;
	
	public EnderecoDAO() {
	this.session = CreateSession.getSession();
	}
	
	public void adiciona(Endereco endereco) {
		Transaction transaction = session.beginTransaction();
		session.save(endereco);
		transaction.commit();
	}

	/*
	public void remove(Endereco endereco) {
		Transaction transaction = session.beginTransaction();
		session.delete(endereco);
		transaction.commit();
	}
	*/
	
}
