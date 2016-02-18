package br.com.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestaofesta.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
