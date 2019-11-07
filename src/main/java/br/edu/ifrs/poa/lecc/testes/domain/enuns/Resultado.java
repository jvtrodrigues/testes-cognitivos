package br.edu.ifrs.poa.lecc.testes.domain.enuns;

public enum Resultado {
	SEM_DADOS("Não Respondido"), PRE_FORMAL("Pré-formal"), CONCRETO("Concreto"), FORMAL_A("Formal A"), FORMAL_B("Formal B");
	
	private String desc;
	
	private Resultado(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
