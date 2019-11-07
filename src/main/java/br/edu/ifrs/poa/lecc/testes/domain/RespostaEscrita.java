package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaEscrita extends Resposta {
	private static final long serialVersionUID = 1L;
	private String respostaEscrita;
	private PerguntaEscrita pergunta;
	
	public RespostaEscrita() {
		super();
	}
	
	public RespostaEscrita(Integer id, StatusResposta statusRespota, String respostaEscrita, PerguntaEscrita pergunta) {
		super(id, statusRespota);
		this.respostaEscrita = respostaEscrita;
		this.pergunta = pergunta;
	}

	public String getRespostaEscrita() {
		return respostaEscrita;
	}

	public void setRespostaEscrita(String respostaEscrita) {
		this.respostaEscrita = respostaEscrita;
	}

	public PerguntaEscrita getPergunta() {
		return pergunta;
	}

	public void setPergunta(PerguntaEscrita pergunta) {
		this.pergunta = pergunta;
	}

	@Override
	public void corrige() {
		
	}	
}
