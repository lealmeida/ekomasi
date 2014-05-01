package br.com.ekomasi.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.expression.ParseException;

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

}
