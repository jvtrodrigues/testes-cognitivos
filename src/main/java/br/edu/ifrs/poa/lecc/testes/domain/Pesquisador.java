package br.edu.ifrs.poa.lecc.testes.domain;

import javax.persistence.Entity;

@Entity
public class Pesquisador extends Usuario {	
	private static final long serialVersionUID = 1L;
	
	public Pesquisador() {
		super();		
	}

	public Pesquisador(Integer id, String nome, String cpf, String identificador, String senha) {
		super(id, nome, cpf, identificador, senha);
	}
		
	@Override
	public void criarConta() {
		
		
	}

	@Override
	public void logar() {
		
		
	}

	@Override
	public void editarPerfil() {
		
		
	}
	
	
}
