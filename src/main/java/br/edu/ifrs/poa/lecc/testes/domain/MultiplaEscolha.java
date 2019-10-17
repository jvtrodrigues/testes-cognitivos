package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MultiplaEscolha extends Pergunta {
	private static final long serialVersionUID = 1L;
	
	@ElementCollection
	@CollectionTable(name="OPCOES_PERGUNTA")
	private Set<String> opcoes = new HashSet<>();
	
	public MultiplaEscolha() {}

	public MultiplaEscolha(Integer id, String enunciado, TipoPergunta tipoPergunta, boolean exemplo) {
		super(id, enunciado, tipoPergunta, exemplo);
	}

	public Set<String> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(Set<String> opcoes) {
		this.opcoes = opcoes;
	}
	
	
}
