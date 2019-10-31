package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;

@Entity
public class PerguntaMultiResposta extends MultiplaEscolha {
	private static final long serialVersionUID = 1L;
	
	
	@ElementCollection
	@CollectionTable(name="LETRAS_CORRETAS_PERGUNTA")
	@Enumerated(EnumType.STRING)
	private Set<Letra> letrasCorretas = new HashSet<>();
	
	public PerguntaMultiResposta() {}

	public PerguntaMultiResposta(Integer id, String enunciado, TipoPergunta tipoPergunta, boolean exemplo) {
		super(id, enunciado, tipoPergunta, exemplo);
	}



	public Set<Letra> getLetrasCorretas() {
		return letrasCorretas;
	}

	public void setLetrasCorretas(Set<Letra> letrasCorretas) {
		this.letrasCorretas = letrasCorretas;
	}
	
}
