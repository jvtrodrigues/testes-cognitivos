package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Resultado;

@Entity
public class Toflp extends Toc {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@Column(nullable = true)
	@OneToMany(mappedBy = "toc")
	private List<RespostaMultiplaEscolha> respostasMultiplaEscolha  = new ArrayList<>();
	
	@JsonIgnore
	@Column(nullable = true)
	@OneToMany(mappedBy = "toc")
	private List<RespostaMultiResposta> respostasMultiRespostas  = new ArrayList<>();
	
	public Toflp() {
		super();
	}
	
	public Toflp(Integer id, Resultado resultado) {
		super(id, resultado);
	}

	public List<RespostaMultiplaEscolha> getRespostasMultiplaEscolha() {
		return respostasMultiplaEscolha;
	}

	public void setRespostasMultiplaEscolha(List<RespostaMultiplaEscolha> respostasMultiplaEscolha) {
		this.respostasMultiplaEscolha = respostasMultiplaEscolha;
	}

	public List<RespostaMultiResposta> getRespostasMultiRespostas() {
		return respostasMultiRespostas;
	}

	public void setRespostasMultiRespostas(List<RespostaMultiResposta> respostasMultiRespostas) {
		this.respostasMultiRespostas = respostasMultiRespostas;
	}

	@Override
	public void conceituar() {
		
	}
	
}
