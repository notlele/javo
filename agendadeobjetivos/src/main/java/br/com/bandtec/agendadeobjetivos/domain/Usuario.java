package br.com.bandtec.agendadeobjetivos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long idUser;
	@JsonProperty
	private String login;
	@JsonProperty
	private String senha;
	private String nome;
	private Integer idade;

	public Usuario(String nome, Integer idade, Long idUser, String login, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.idUser = idUser;
		this.login = login;
		this.senha = senha;
	}


	public Usuario buscarUsando(String login, String senha) {
		return getLogin(), getSenha();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
