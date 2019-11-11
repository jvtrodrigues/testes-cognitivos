package br.edu.ifrs.poa.lecc.testes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifrs.poa.lecc.testes.domain.Aluno;
import br.edu.ifrs.poa.lecc.testes.domain.PerguntaEscrita;
import br.edu.ifrs.poa.lecc.testes.domain.PerguntaMultiResposta;
import br.edu.ifrs.poa.lecc.testes.domain.Pesquisador;
import br.edu.ifrs.poa.lecc.testes.domain.RespostaEscrita;
import br.edu.ifrs.poa.lecc.testes.domain.RespostaMultiResposta;
import br.edu.ifrs.poa.lecc.testes.domain.Tofc;
import br.edu.ifrs.poa.lecc.testes.domain.Toflp;
import br.edu.ifrs.poa.lecc.testes.domain.Tofp;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Resultado;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.Sexo;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoCurso;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;
import br.edu.ifrs.poa.lecc.testes.repositories.AlunoRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaEscritaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaMultiRespostaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.PesquisadorRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaEscritaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaMultiRespostaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaMultiplaEscolhaRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.TofcRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.ToflpRepository;
import br.edu.ifrs.poa.lecc.testes.repositories.TofpRepository;

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
	@Autowired
	private TofcRepository tofcRepo;
	@Autowired
	private RespostaEscritaRepository resEscRepo;
	@Autowired
	private TofpRepository tofpRepo;
	@Autowired
	private RespostaMultiplaEscolhaRepository resMulEscRepo;
	@Autowired
	private ToflpRepository toflpRepo;
	@Autowired
	private RespostaMultiRespostaRepository resMulResRepo;
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
		
		Tofc t1 = new Tofc(null, Resultado.CONCRETO);
		Tofp t2 = new Tofp(null, Resultado.CONCRETO);
		Toflp t3 = new Toflp(null, Resultado.CONCRETO);
		
		tofcRepo.saveAll(Arrays.asList(t1));
		tofpRepo.saveAll(Arrays.asList(t2));
		toflpRepo.saveAll(Arrays.asList(t3));
		
		perEscRepo.saveAll(Arrays.asList(perEsc1, perEsc2));
		perMultiRespRepo.saveAll(Arrays.asList(pergMultResp1, pergMultResp2));
		
		RespostaEscrita respEsc = new RespostaEscrita(null, StatusResposta.NAO_RESPONDIDA, "Desconheço", perEsc1, t1);
		RespostaMultiResposta respMultResp = new RespostaMultiResposta(null, StatusResposta.NAO_RESPONDIDA, pergMultResp1, t3);
		Letra letras [] = {Letra.A, Letra.D};
		respMultResp.setRespostasLetra(new HashSet<Letra>(Arrays.asList(letras)));
		
		resEscRepo.saveAll(Arrays.asList(respEsc));
		resMulResRepo.saveAll(Arrays.asList(respMultResp));
		
		List<RespostaEscrita> listResEsc = new ArrayList<>();
		listResEsc.add(respEsc);
		t1.setRespostasEscritas(listResEsc);
		
		List<RespostaMultiResposta> listResMulRes = new ArrayList<>();
		listResMulRes.add(respMultResp);
		t3.setRespostasMultiRespostas(listResMulRes);
		
		tofcRepo.saveAll(Arrays.asList(t1));
		toflpRepo.saveAll(Arrays.asList(t3));
		
		pesquiRepo.saveAll(Arrays.asList(pesq1, pesq2));
		alunoRepo.saveAll(Arrays.asList(a1));
		
		
		
		
		
		
		
		
		
		
	}

}
