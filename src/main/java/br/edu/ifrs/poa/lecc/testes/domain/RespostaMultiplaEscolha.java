package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaMultiplaEscolha extends Resposta {
	private static final long serialVersionUID = 1L;
	private Letra respostaLetra;
	private PerguntaMultiplaEscolha pergunta;

	public RespostaMultiplaEscolha() {
		super();
	}

	public RespostaMultiplaEscolha(Integer id, StatusResposta statusRespota, Letra respostaLetra,
			PerguntaMultiplaEscolha pergunta) {
		super(id, statusRespota);
		this.respostaLetra = respostaLetra;
		this.pergunta = pergunta;
	}

	public Letra getRespostaLetra() {
		return respostaLetra;
	}

	public void setRespostaLetra(Letra respostaLetra) {
		this.respostaLetra = respostaLetra;
	}

	public PerguntaMultiplaEscolha getPergunta() {
		return pergunta;
	}

	public void setPergunta(PerguntaMultiplaEscolha pergunta) {
		this.pergunta = pergunta;
	}

	@Override
	public void corrige() {

	}
}
