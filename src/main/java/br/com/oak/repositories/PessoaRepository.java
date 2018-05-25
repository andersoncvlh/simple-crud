package br.com.oak.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
