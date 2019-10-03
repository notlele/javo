package br.com.bandtec.agendadeobjetivos.controller;

import br.com.bandtec.agendadeobjetivos.domain.TodosUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private TodosUsuarios todosUsuarios;
	@Autowired
	public LoginController(TodosUsuarios todosUsuarios) { this.todosUsuarios = todosUsuarios; }

	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credenciais) {
		if(todosUsuarios.buscarUsando(credenciais) != null) {
			return ResponseEntity.ok("Sucesso");
		}
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Erro");
		}
	}

}
