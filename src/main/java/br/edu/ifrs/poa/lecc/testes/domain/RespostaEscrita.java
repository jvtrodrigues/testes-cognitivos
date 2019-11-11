package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
public class RespostaEscrita extends Resposta {
	private static final long serialVersionUID = 1L;
	
	private String respostaEscrita;
	
	@ManyToOne
	@JoinColumn(name="pergunta_id")
	private PerguntaEscrita pergunta;
	
	@ManyToOne
	@JoinColumn(name="toc_id")
	private Toc toc;
	
	public RespostaEscrita() {
		super();
	}

	public RespostaEscrita(Integer id, StatusResposta statusRespota, String respostaEscrita, PerguntaEscrita pergunta,
			Toc toc) {
		super(id, statusRespota);
		this.respostaEscrita = respostaEscrita;
		this.pergunta = pergunta;
		this.toc = toc;
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
