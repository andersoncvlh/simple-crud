package br.com.oak.models.dto;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private Integer idade;
	
	private Integer qtdTels;
	
	private Date dataNascimento;
	
	private String email;

	public PessoaDTO() {}
	
	public PessoaDTO(Long id, String nome, String cpf, String email, Date dataNascimento, Long qtdTels) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.qtdTels = qtdTels.intValue();
		this.email = email;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Integer getIdade() {
		try {
			DateTime dataAtual = new DateTime();
			DateTime dataNascimento = new DateTime(this.dataNascimento);
			Interval interval = new Interval(dataNascimento, dataAtual);
			this.idade = interval.toPeriod().getYears();
			return idade;
		} catch (Exception e) {
			return 0;
		}
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(Integer qtdTels) {
		this.qtdTels = qtdTels;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
