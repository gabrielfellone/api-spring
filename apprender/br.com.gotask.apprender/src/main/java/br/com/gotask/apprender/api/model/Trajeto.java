package br.com.gotask.apprender.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Trajeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 30)
	@Column(name = "numAcerto")
	private String numAcerto;

	@Size(max = 30)
	@Column(name = "numErro")
	private String numErro;

	@Size(max = 30)
	@Column(name = "pontuacao")
	private String pontuacao;

	@Size(max = 80)
	@Column(name = "qntAjuda")
	private String qntAjuda;

	@Size(max = 80)
	@Column(name = "tempoResposta")
	private String tempoResposta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumAcerto() {
		return numAcerto;
	}

	public void setNumAcerto(String numAcerto) {
		this.numAcerto = numAcerto;
	}

	public String getNumErro() {
		return numErro;
	}

	public void setNumErro(String numErro) {
		this.numErro = numErro;
	}

	public String getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getQntAjuda() {
		return qntAjuda;
	}

	public void setQntAjuda(String qntAjuda) {
		this.qntAjuda = qntAjuda;
	}

	public String getTempoResposta() {
		return tempoResposta;
	}

	public void setTempoResposta(String tempoResposta) {
		this.tempoResposta = tempoResposta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

}
