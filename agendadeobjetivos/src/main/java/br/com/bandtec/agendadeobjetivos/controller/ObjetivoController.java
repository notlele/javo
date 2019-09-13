package br.com.bandtec.agendadeobjetivos.controller;

import br.com.bandtec.agendadeobjetivos.domain.Objetivo;
import br.com.bandtec.agendadeobjetivos.domain.TodosObjetivos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ObjetivoController {
    private TodosObjetivos todosObjetivos;

    @Autowired
    public ObjetivoController(TodosObjetivos todosObjetivos) {
        this.todosObjetivos = todosObjetivos;
    }

    @PostMapping("/objetivos")
    public ResponseEntity<String> salvar(@RequestBody Objetivo objetivo) {
        todosObjetivos.save(objetivo);
        return ResponseEntity.status(HttpStatus.OK).body("Sucesso");
    }


    @GetMapping("/objetivos/data/{data}")
    public ResponseEntity<List<Objetivo>> obterPorData(
            @PathVariable("data") String data) {
        LocalDate xxxx = LocalDate.parse(data);
        List<Objetivo> objetivosEncontrados;

        objetivosEncontrados = todosObjetivos.ate(xxxx);

        if (objetivosEncontrados.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(objetivosEncontrados);
        }
    }
}