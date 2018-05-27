package br.com.oak.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import br.com.oak.models.Pessoa;
import br.com.oak.repositories.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

	Page<Pessoa> findByNomeAndCpfOrderByIdAsc(@Nullable String nome, @Nullable String cpf, Pageable pageable);
	
}
