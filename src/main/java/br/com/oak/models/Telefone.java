package br.com.oak.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Size(min = 2, max = 3)
	private String ddd;
	
	@NotBlank
	@Size(min = 8, max = 9)
	private String numero;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	public Telefone() {	}
	
	public Telefone(String ddd, String numero, Pessoa pessoa) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.pessoa = pessoa;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
