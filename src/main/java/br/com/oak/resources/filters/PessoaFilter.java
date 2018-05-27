package br.com.oak.resources.filters;

import java.io.Serializable;

public class PessoaFilter implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
