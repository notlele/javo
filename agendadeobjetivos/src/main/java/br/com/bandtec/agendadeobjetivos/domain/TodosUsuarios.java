package br.com.bandtec.agendadeobjetivos.domain;

import br.com.bandtec.agendadeobjetivos.controller.Credenciais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
        
@Repository
public interface TodosUsuarios extends JpaRepository<Usuario, Long> {
        @Query("select o from Usuario o where o.login = login && o.senha = senha")
        public Usuario buscarUsando(@Param("credenciais") Credenciais credenciais);
}
