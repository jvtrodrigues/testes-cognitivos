package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaMultiResposta extends Resposta {
	private static final long serialVersionUID = 1L;
	@ElementCollection
	@CollectionTable(name="LETRAS_CORRETAS_RESPOSTA")
	@Enumerated(EnumType.STRING)
	private Set<Letra> respostasLetra  = new HashSet<>();
	private PerguntaMultiResposta pergunta;

	public RespostaMultiResposta() {
		super();
	}

	public RespostaMultiResposta(Integer id, StatusResposta statusRespota, PerguntaMultiResposta pergunta) {
		super(id, statusRespota);
		this.pergunta = pergunta;
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

	@Override
	public void corrige() {

	}
}
