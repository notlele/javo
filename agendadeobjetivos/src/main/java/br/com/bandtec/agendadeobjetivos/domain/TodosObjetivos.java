package br.com.bandtec.agendadeobjetivos.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosObjetivos extends JpaRepository<Objetivo, > {
	public void save(Objetivo objetivo);
	public List<Objetivo> ate(LocalDate data);

}
