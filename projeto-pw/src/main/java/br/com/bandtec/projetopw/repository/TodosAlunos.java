package br.com.bandtec.projetopw.repository;

import br.com.bandtec.projetopw.domain.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bandtec.projetopw.domain.Aluno;
import br.com.bandtec.projetopw.domain.RA;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodosAlunos extends JpaRepository<Aluno, UUID> {
	@Query("from Aluno")
	Aluno comRA(RA ra);

}
