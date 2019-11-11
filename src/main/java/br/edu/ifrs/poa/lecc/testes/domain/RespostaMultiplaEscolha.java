package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaMultiplaEscolha extends Resposta {
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private Letra respostaLetra;
	
	@ManyToOne
	@JoinColumn(name="pergunta_id")
	private PerguntaMultiplaEscolha pergunta;
	
	@ManyToOne
	@JoinColumn(name="toc_id")
	private Toc toc;

	public RespostaMultiplaEscolha() {
		super();
	}

	public RespostaMultiplaEscolha(Integer id, StatusResposta statusRespota, Letra respostaLetra,
			PerguntaMultiplaEscolha pergunta, Toc toc) {
		super(id, statusRespota);
		this.respostaLetra = respostaLetra;
		this.pergunta = pergunta;
		this.toc = toc;
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
