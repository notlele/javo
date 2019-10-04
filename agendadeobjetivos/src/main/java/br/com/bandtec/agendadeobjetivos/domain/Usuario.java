package br.com.bandtec.agendadeobjetivos.domain;

import br.com.bandtec.agendadeobjetivos.controller.Credenciais;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long idUser;

	@Embedded
	private Credenciais credenciais;

	private String nome;
	private Integer idade;

	@OneToMany(mappedBy = "usuario")
	private List<Objetivo> objetivos;

	public Usuario(Long idUser, Credenciais credenciais, String nome, Integer idade) {
		this.idUser = idUser;
		this.credenciais = credenciais;
		this.nome = nome;
		this.idade = idade;
	}
}
