package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Letra;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;

@Entity
public class PerguntaMultiplaEscolha extends MultiplaEscolha {
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private Letra letraCorreta;
	
	public PerguntaMultiplaEscolha() {}
	
	public PerguntaMultiplaEscolha(Integer id, String enunciado, TipoPergunta tipoPergunta, boolean exemplo,
			Letra letraCorreta) {
		super(id, enunciado, tipoPergunta, exemplo);
		this.letraCorreta = letraCorreta;
	}



	public Letra getLetraCorreta() {
		return letraCorreta;
	}

	public void setLetraCorreta(Letra letraCorreta) {
		this.letraCorreta = letraCorreta;
	}	
	
}
