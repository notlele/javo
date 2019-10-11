package br.com.bandtec.agendadeobjetivos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mentor {
	@Id
	@GeneratedValue
	private Long id;
	@JsonProperty
	private String nome;
	@JsonProperty
	private String profissao;

	public Mentor(){}

	public Mentor(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
