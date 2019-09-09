package br.com.gotask.apprender.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.gotask.apprender.api.bo.UsuarioBO;
import br.com.gotask.apprender.api.model.Usuario;
import br.com.gotask.apprender.api.repository.UsuarioRepository;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarios;

	@Autowired
	private UsuarioBO usuarioBo;

	// Lista tudo da tabela usuario
	@GetMapping
	public List<Usuario> listar() throws Exception {

		return usuarioBo.listaTudoUsuario();
	}

	// Adiciona usuario
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionar(@Valid @RequestBody Usuario Usuario) throws Exception {

		return usuarioBo.adicionarUsuario(Usuario);
		// return usuarios.save(Usuario);
	}

	// Busca por ID
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
		Optional<Usuario> Usuario = usuarios.findById(id);

		if (Usuario == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(Usuario.get());
	}

	// Deleta usuario por ID
	@DeleteMapping("/{id}")
	public void deleteusuarios(@PathVariable Long id) {
		usuarios.deleteById(id);
	}

	// Atualiza usuario por ID
	@PutMapping("{id}")
	public ResponseEntity<Object> updateusuarios(@RequestBody Usuario Usuario, @PathVariable Long id) {

		Optional<Usuario> UsuarioExistente = usuarios.findById(id);

		if (!UsuarioExistente.isPresent())
			return ResponseEntity.notFound().build();

		Usuario.setId(id);

		usuarios.save(Usuario);

		return ResponseEntity.noContent().build();
	}

}
