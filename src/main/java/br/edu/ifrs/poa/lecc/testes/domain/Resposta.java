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

import br.edu.ifrs.poa.lecc.testes.domain.enuns.StatusResposta;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Resposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private StatusResposta statusRespota;
	
	public Resposta() {
	}

	public Resposta(Integer id, StatusResposta statusRespota) {
		super();
		this.id = id;
		this.statusRespota = statusRespota;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StatusResposta getStatusRespota() {
		return statusRespota;
	}

	public void setStatusRespota(StatusResposta statusRespota) {
		this.statusRespota = statusRespota;
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
		Resposta other = (Resposta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public abstract void corrige();
}