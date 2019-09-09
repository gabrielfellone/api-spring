package br.com.gotask.apprender.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Questao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(max = 30)
	@Column(name = "titulo")
	private String titulo;

	@Size(max = 30)
	@Column(name = "dificuldade")
	private String dificuldade;

	@Size(max = 30)
	@Column(name = "tempoResposta")
	private String tempoResposta;

	@Size(max = 80)
	@Column(name = "descricao")
	private String descricao;

	@Size(max = 80)
	@Column(name = "respostaCerta")
	private String respostaCerta;

	@Size(max = 80)
	@Column(name = "resultado")
	private String resultado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getTempoResposta() {
		return tempoResposta;
	}

	public void setTempoResposta(String tempoResposta) {
		this.tempoResposta = tempoResposta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

}
