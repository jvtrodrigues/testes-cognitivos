package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;

@Entity
public class PerguntaEscrita extends Pergunta {
	private static final long serialVersionUID = 1L;
	
	private String respostaEscrita;
	
	public PerguntaEscrita() {}
	
	

	public PerguntaEscrita(Integer id, String enunciado, TipoPergunta tipoPergunta, boolean exemplo,
			String respostaEscrita) {
		super(id, enunciado, tipoPergunta, exemplo);
		this.respostaEscrita = respostaEscrita;
	}



	public String getRespostaEscrita() {
		return respostaEscrita;
	}

	public void setRespostaEscrita(String respostaEscrita) {
		this.respostaEscrita = respostaEscrita;
	}

}
