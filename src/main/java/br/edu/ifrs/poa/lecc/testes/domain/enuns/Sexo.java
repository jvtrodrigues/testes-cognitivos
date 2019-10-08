package br.edu.ifrs.poa.lecc.testes.domain.enuns;

public enum Sexo {
	FEMININO("Feminino"), MASCULINO("Masculino");
	
	private String desc;
	
	private Sexo(String desc) {
		this.desc = desc;
	}
}
