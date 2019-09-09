package br.com.gotask.apprender.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import br.com.gotask.apprender.api.model.Usuario;
import br.com.gotask.apprender.api.utility.SQLEnum;

@Component
public class Dao {
	private PreparedStatement stmt = null;

	String querySql;

	@PersistenceContext
	private EntityManager em;

	public List<Usuario> listaTudoUsuario(SQLEnum sql) {
		querySql = sql.getQuery();
		TypedQuery<Usuario> query = em.createQuery(querySql, Usuario.class);
		return query.getResultList();

	}

	public void addUsuario(Connection c, Usuario u, SQLEnum sql) throws Exception {
		querySql = sql.getQuery();
		stmt = c.prepareStatement(querySql);
		stmt.setString(1, u.getNomeUsuario());
		stmt.setString(2, u.getResponsavel());
		stmt.setString(3, u.getEmail());
		stmt.execute();
		stmt.close();
	}
}
