package br.edu.ifrs.poa.lecc.testes;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifrs.poa.lecc.testes.domain.Aluno;
import br.edu.ifrs.poa.lecc.testes.domain.Pesquisador;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Sexo;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoCurso;
import br.edu.ifrs.poa.lecc.testes.repositories.AlunoRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PesquisadorRepository;

@SpringBootApplication
public class TestesCognitivosApplication implements CommandLineRunner {
	@Autowired
	private PesquisadorRepository pesquiRepo;
	@Autowired
	private AlunoRepository alunoRepo;
	public static void main(String[] args) {
		SpringApplication.run(TestesCognitivosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Pesquisador pesq1 = new Pesquisador(null, "José Rodrigues", "024.684.480-90", "admin", "senha123");
		Pesquisador pesq2 = new Pesquisador(null, "Vicente Teixeira", "024.684.480-91", "admilson", "123senha123");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar cal = GregorianCalendar.getInstance();
		int ano = (cal.get(Calendar.YEAR));
		int semestre = 1;
		if(cal.get(Calendar.DAY_OF_YEAR)>=183) {
			semestre = 2;
		}
		
		Aluno a1 = new Aluno(null, "Narutinho", "666.666.666-66", "Narutinho", "senhadafolha", sdf.parse("29/10/1998 12:14"), Sexo.MASCULINO, TipoCurso.SUPERIOR, ano, semestre);
		
		pesquiRepo.saveAll(Arrays.asList(pesq1, pesq2));
		alunoRepo.saveAll(Arrays.asList(a1));
		
	}

}
