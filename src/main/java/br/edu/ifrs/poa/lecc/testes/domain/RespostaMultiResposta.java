package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaMultiResposta extends Resposta {
	private static final long serialVersionUID = 1L;
	
	@ElementCollection
	@CollectionTable(name="LETRAS_CORRETAS_RESPOSTA")
	@Enumerated(EnumType.STRING)
	private Set<Letra> respostasLetra  = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="pergunta_id")
	private PerguntaMultiResposta pergunta;
	
	@ManyToOne
	@JoinColumn(name="toc_id")
	private Toc toc;

	public RespostaMultiResposta() {
		super();
	}

	public RespostaMultiResposta(Integer id, StatusResposta statusRespota, PerguntaMultiResposta pergunta, Toc toc) {
		super(id, statusRespota);
		this.pergunta = pergunta;
		this.toc = toc;
	}

	public Set<Letra> getRespostasLetra() {
		return respostasLetra;
	}

	public void setRespostasLetra(Set<Letra> respostasLetra) {
		this.respostasLetra = respostasLetra;
	}

	public PerguntaMultiResposta getPergunta() {
		return pergunta;
	}

	public void setPergunta(PerguntaMultiResposta pergunta) {
		this.pergunta = pergunta;
	}

	public Toc getToc() {
		return toc;
	}

	public void setToc(Toc toc) {
		this.toc = toc;
	}

	@Override
	public void corrige() {

	}
}
