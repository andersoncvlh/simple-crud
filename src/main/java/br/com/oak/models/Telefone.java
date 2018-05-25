package br.com.oak.models;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Telefone extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ddd;
	
	private String numero;

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
	
}
