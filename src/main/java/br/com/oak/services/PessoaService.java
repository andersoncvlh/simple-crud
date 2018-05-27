package br.com.oak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.oak.models.Pessoa;
import br.com.oak.models.dto.PessoaDTO;
import br.com.oak.repositories.PessoaRepository;
import br.com.oak.resources.filters.PessoaFilter;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Page<PessoaDTO> findByFilters(PessoaFilter filter, Pageable pageable) {
		return pessoaRepository.findByFilter(filter, pageable);
	}
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public void delete(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
}
