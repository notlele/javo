package br.com.bandtec.agendadeobjetivos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Impeditivo {

	@Id
	@GeneratedValue
	private Long id;
	@JsonProperty
	private String nome;
	@JsonProperty
	private String motivo;

	@ManyToOne
	@JoinColumn(name = "id_objetivo")
	private Objetivo objetivo;
	
	public Impeditivo() {}

	public Impeditivo(String nome, String motivo) {
		super();
		this.nome = nome;
		this.motivo = motivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
}
