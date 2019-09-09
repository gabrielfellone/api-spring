package br.com.gotask.apprender.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gotask.apprender.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// Optional<Usuario> findByNomeUsuarioResponsavel(String nomeUsuario, String
	// responsavel);

}
