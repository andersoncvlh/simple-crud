package br.com.oak.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oak.models.Pessoa;
import br.com.oak.services.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public List<Pessoa> findByFilters() {
		return pessoaService.findByFilters();
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
