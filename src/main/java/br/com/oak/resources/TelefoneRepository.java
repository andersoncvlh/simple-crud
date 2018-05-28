package br.com.oak.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.models.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
