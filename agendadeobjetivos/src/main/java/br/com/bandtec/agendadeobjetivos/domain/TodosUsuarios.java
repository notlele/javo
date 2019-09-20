package br.com.bandtec.agendadeobjetivos.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
        
@Repository
public interface TodosUsuarios extends JpaRepository<Objetivo, Long> {
        @Query("select o from Usuario o where o.login = login && o.senha = senha")
        public Usuario buscarUsando(String login, String senha);
}
