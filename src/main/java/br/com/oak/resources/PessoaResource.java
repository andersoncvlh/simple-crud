package br.com.oak.resources;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable("id") Long idPessoa) {
		Pessoa pessoa = pessoaService.findById(idPessoa);
		return null != pessoa ? ResponseEntity.ok(pessoa) : ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) throws URISyntaxException {
		Pessoa pessoaCriada = pessoaService.save(pessoa);		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
			.path("/{codigo}").buildAndExpand(pessoaCriada.getId()).toUri();
		return null != pessoaCriada ? ResponseEntity.created(uri).body(pessoaCriada) : null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Pessoa> delete(@PathVariable("id") Long pessoa) {
		pessoaService.deleteById(pessoa);
		return ResponseEntity.noContent().build();
	}
	
}
