package br.com.oak.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oak.models.Pessoa;
import br.com.oak.models.dto.PessoaDTO;
import br.com.oak.resources.filters.PessoaFilter;
import br.com.oak.services.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public ResponseEntity<Page<PessoaDTO>> findByFilters(PessoaFilter filter, Pageable pageable) {
		Page<PessoaDTO> pessoas = pessoaService.findByFilters(filter, pageable);
		return null != pessoas && pessoas.hasContent() ? ResponseEntity.ok(pessoas) : ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public Pessoa salvar(@RequestBody Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Pessoa pessoa) {
		pessoaService.delete(pessoa);
	}
	
}
