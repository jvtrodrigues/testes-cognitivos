package br.edu.ifrs.poa.lecc.testes;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifrs.poa.lecc.testes.domain.Aluno;
import br.edu.ifrs.poa.lecc.testes.domain.PerguntaEscrita;
import br.edu.ifrs.poa.lecc.testes.domain.PerguntaMultiResposta;
import br.edu.ifrs.poa.lecc.testes.domain.Pesquisador;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Sexo;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoCurso;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;
import br.edu.ifrs.poa.lecc.testes.repositories.AlunoRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaEscritaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaMultiRespostaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PesquisadorRepository;

@SpringBootApplication
public class TestesCognitivosApplication implements CommandLineRunner {
	@Autowired
	private PesquisadorRepository pesquiRepo;
	@Autowired
	private AlunoRepository alunoRepo;
	@Autowired
	private PerguntaEscritaRepository perEscRepo;
	@Autowired
	private PerguntaMultiRespostaRepository perMultiRespRepo;
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
		
		PerguntaEscrita perEsc1 = new PerguntaEscrita(null, "Qual o melhor jogador do mundo?", TipoPergunta.TOFC, false, "Everton");
		PerguntaEscrita perEsc2 = new PerguntaEscrita(null, "Qual o pior jogador do mundo?", TipoPergunta.TOFLP, false, "Neymar");
		
		PerguntaMultiResposta pergMultResp1 = new PerguntaMultiResposta(null, "São da equipe 7:", TipoPergunta.TOFP, false);
		Set<String> opcoes = new HashSet<>();
		opcoes.add("Naruto");
		opcoes.add("Shikamaru");
		opcoes.add("Sasori");
		opcoes.add("Kakashi");
		
		Set<Letra> letrasCorretas = new HashSet<>();
		letrasCorretas.add(Letra.A);
		letrasCorretas.add(Letra.D);
		
		pergMultResp1.setOpcoes(opcoes);
		pergMultResp1.setLetrasCorretas(letrasCorretas);
		
		PerguntaMultiResposta pergMultResp2 = new PerguntaMultiResposta(null, "São da equipe 10:", TipoPergunta.TOFLP, false);
		Set<String> opcoes2 = new HashSet<>();
		opcoes2.add("Ino");
		opcoes2.add("Shikamaru");
		opcoes2.add("Sasori");
		opcoes2.add("Kakashi");
		
		Set<Letra> letrasCorretas2 = new HashSet<>();
		letrasCorretas2.add(Letra.A);
		letrasCorretas2.add(Letra.B);
		
		pergMultResp2.setOpcoes(opcoes2);
		pergMultResp2.setLetrasCorretas(letrasCorretas2);
		
		
		pesquiRepo.saveAll(Arrays.asList(pesq1, pesq2));
		alunoRepo.saveAll(Arrays.asList(a1));
		perEscRepo.saveAll(Arrays.asList(perEsc1, perEsc2));
		perMultiRespRepo.saveAll(Arrays.asList(pergMultResp1, pergMultResp2));
	}

}
