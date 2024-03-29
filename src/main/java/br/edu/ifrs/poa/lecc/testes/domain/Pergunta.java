package br.edu.ifrs.poa.lecc.testes.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoPergunta;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pergunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String enunciado;
	
	@Enumerated(EnumType.STRING)
	private TipoPergunta tipoPergunta;
	
	private boolean exemplo;
	

	public Pergunta() {
	}

	

	public Pergunta(Integer id, String enunciado, TipoPergunta tipoPergunta, boolean exemplo) {
		super();
		this.id = id;
		this.enunciado = enunciado;
		this.tipoPergunta = tipoPergunta;
		this.exemplo = exemplo;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public boolean isExemplo() {
		return exemplo;
	}

	public void setExemplo(boolean exemplo) {
		this.exemplo = exemplo;
	}

	public TipoPergunta getTipoPergunta() {
		return tipoPergunta;
	}

	public void setTipoPergunta(TipoPergunta tipoPergunta) {
		this.tipoPergunta = tipoPergunta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pergunta other = (Pergunta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
