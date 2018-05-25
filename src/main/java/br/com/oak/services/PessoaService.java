package br.com.oak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oak.models.Pessoa;
import br.com.oak.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> findByFilters() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public void delete(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
}
