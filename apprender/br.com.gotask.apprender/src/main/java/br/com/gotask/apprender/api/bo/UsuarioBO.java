package br.com.gotask.apprender.api.bo;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import br.com.gotask.apprender.api.dao.Dao;
import br.com.gotask.apprender.api.factory.ConnectionFactory;
import br.com.gotask.apprender.api.model.Usuario;
import br.com.gotask.apprender.api.utility.SQLEnum;

@Component
public class UsuarioBO {
	
	@Autowired
	Dao dao;
	
	String querySql;

	private Connection connection;

	@Autowired
	private ConnectionFactory c;

	public Usuario adicionarUsuario(Usuario usuario) throws Exception {

		this.connection = c.getConnection();
		dao.addUsuario(connection, usuario, SQLEnum.INSERIR_USUARIO);
		return usuario;
	}

	public List<Usuario> listaTudoUsuario() throws Exception {
		return dao.listaTudoUsuario(SQLEnum.BUSCA_TODOS_USUARIO);
	}
}
