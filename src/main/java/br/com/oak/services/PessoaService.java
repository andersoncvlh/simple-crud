package br.com.oak.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.oak.config.exceptions.PessoaInexistenteException;
import br.com.oak.models.Pessoa;
import br.com.oak.models.Telefone;
import br.com.oak.models.dto.PessoaDTO;
import br.com.oak.repositories.PessoaRepository;
import br.com.oak.resources.TelefoneRepository;
import br.com.oak.resources.filters.PessoaFilter;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public Page<PessoaDTO> findByFilters(PessoaFilter filter, Pageable pageable) {
		return pessoaRepository.findByFilter(filter, pageable);
	}
	
	public Pessoa findById(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public void delete(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
	public void deleteById(Long pessoa) {
		pessoaRepository.deleteById(pessoa);
	}
	
	public Pessoa atualizar(Long id, Pessoa novaPessoa) {
		Pessoa pessoaOld = pessoaRepository.findById(id).orElseThrow(() -> new PessoaInexistenteException());
		removerTelefonesExlcuidosPeloUsuario(novaPessoa, pessoaOld);
		BeanUtils.copyProperties(novaPessoa, pessoaOld, "id");
		
		return pessoaRepository.save(pessoaOld);
	}

	private void removerTelefonesExlcuidosPeloUsuario(Pessoa novaPessoa, Pessoa pessoaOld) {
		if (null != pessoaOld.getTelefones() && !pessoaOld.getTelefones().isEmpty()) {			
			pessoaOld.getTelefones().stream()
				.filter(tel -> !novaPessoa.getTelefones().contains(tel))
				.forEach(telRemove -> telefoneRepository.delete(telRemove));
		}
	}
	
}
