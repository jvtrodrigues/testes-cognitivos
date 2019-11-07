package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Resultado;

@Entity
public class Tofc extends Toc {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "")
	private List<RespostaEscrita> respostasEscritas  = new ArrayList<>();
	
	public Tofc() {
		super();
	}
	
	public Tofc(Integer id, Resultado resultado) {
		super(id, resultado);
	}
	
	public List<RespostaEscrita> getRespostasEscritas() {
		return respostasEscritas;
	}

	public void setRespostasEscritas(List<RespostaEscrita> respostasEscritas) {
		this.respostasEscritas = respostasEscritas;
	}

	@Override
	public void conceituar() {
		
	}
	
}
