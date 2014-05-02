package br.com.ekomasi.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import br.com.ekomasi.modelo.Pessoa;
import br.com.ekomasi.util.CreateSession;

public class PessoaDAO {
	
private final Session session;
	
	public PessoaDAO() {
	this.session = CreateSession.getSession();
	}
	
	public void adiciona(Pessoa pessoa) {
		Transaction transaction = session.beginTransaction();

		session.save(pessoa);
		transaction.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> getLista(){
		Query query = session.createQuery("Select p from Pessoa p");
		List<Pessoa> listaPessoa = query.list();
		return listaPessoa;
	}

}
