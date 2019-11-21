package br.com.bandtec.projetopw.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Municipio {

	@JsonProperty
	private String nome;

	@JsonProperty
	private String estado;

	public Municipio(String nome, String estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public String getEstado() {
		return estado;
	}
}
