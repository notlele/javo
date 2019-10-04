package br.com.bandtec.agendadeobjetivos.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "tbObjetivo")
public class Objetivo {

	@Id
	@GeneratedValue
	private Long idObjetivo;

	@JsonProperty
	@Column(name = "objTitle")
	private String titulo;

	@JsonProperty
	@Column(name = "objDesc")
	private String descricao;

	@JsonProperty
	@Column(name = "objDataMax")
	private LocalDate dataMaximaParaExecucao;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Objetivo() {}
	
	public Objetivo(String titulo, String descricao, LocalDate dataMaximaParaExecucao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataMaximaParaExecucao = dataMaximaParaExecucao;
	}

	@Override
	public String toString() {
		return "Objetivo [titulo=" + titulo + ", descricao=" + descricao + ", dataMaximaParaExecucao="
				+ dataMaximaParaExecucao + "]";
	}

	public boolean ate(LocalDate data) {
		return dataMaximaParaExecucao.isBefore(data) || dataMaximaParaExecucao.isEqual(data);
	}


	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataMaximaParaExecucao() {
		return dataMaximaParaExecucao;
	}
}
