package br.com.oak.repositories.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.oak.models.dto.PessoaDTO;
import br.com.oak.resources.filters.PessoaFilter;

public interface PessoaRepositoryQuery {
	
	Page<PessoaDTO> findByFilter(PessoaFilter filter, Pageable pageable);
	
	Long countByFilter(PessoaFilter filter);
	
}
