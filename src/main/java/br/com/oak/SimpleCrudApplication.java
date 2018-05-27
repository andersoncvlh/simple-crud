package br.com.oak;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.oak.models.Pessoa;
import br.com.oak.models.Telefone;
import br.com.oak.repositories.PessoaRepository;

@SpringBootApplication
public class SimpleCrudApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		carregarDados();
	}
	
	private void carregarDados() {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(novaPessoa("Anderson Carvalho Martins", "059392840234", "anderson@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "988888888", "977777777"));
		pessoas.add(novaPessoa("Rebeka Costa", "05194837261", "rebeka@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "984929308", "943872882"));
		pessoas.add(novaPessoa("Geminiano Almeida", "02398174899", "geminiado@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "984738282", "966666666"));
		pessoas.add(novaPessoa("Tom Kindle", "01938549522", "tom@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "999373882", "998746462"));
		pessoas.add(novaPessoa("Cris Lopes", "01930249522", "cris@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "996373882", "998788993"));
		pessoas.add(novaPessoa("Aaron Shore", "04938174892", "aaron@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "984849113", "989834027", "989834027", "989834027", "989834027", "989834027"));
		pessoas.add(novaPessoa("Bruna Lima", "03289487422", "bruna@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		
		
		pessoas.add(novaPessoa("fulano1", "00000000001", "fulano1@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano2", "00000000002", "fulano2@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano3", "00000000003", "fulano3@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano4", "00000000004", "fulano4@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano5", "00000000005", "fulano5@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano6", "00000000006", "fulano6@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano7", "00000000007", "fulano7@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano8", "00000000008", "fulano8@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano9", "00000000009", "fulano9@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano10", "00000000010", "fulano10@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));

		pessoas.add(novaPessoa("fulano11", "00000000011", "fulano11@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano12", "00000000012", "fulano12@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano13", "00000000013", "fulano13@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano14", "00000000014", "fulano14@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano15", "00000000015", "fulano15@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano16", "00000000016", "fulano16@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano17", "00000000017", "fulano17@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano18", "00000000018", "fulano18@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano19", "00000000019", "fulano19@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		pessoas.add(novaPessoa("fulano20", "00000000020", "fulano20@email.com", 
				new LocalDate().withYear(1993).withMonthOfYear(5).withDayOfMonth(4).toDate(), "980480284", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290", "984879290"));
		
		
		
		
		
		pessoaRepository.saveAll(pessoas);
	}

	private Pessoa novaPessoa(String nome, String cpf, String email, Date dataNascimento, String...telefones) {
		final String ddd = "85";
		Pessoa p1 = new Pessoa();
		p1.setNome(nome);
		p1.setCpf(cpf);
		p1.setEmail(email);
		p1.setDataNascimento(dataNascimento);
		List<Telefone> listaTelefone = new ArrayList<>();
		for (String tel : telefones) {
			listaTelefone.add(new Telefone(ddd, tel, p1));
		}
		p1.setTelefones(listaTelefone);
		return p1;
	}

}
