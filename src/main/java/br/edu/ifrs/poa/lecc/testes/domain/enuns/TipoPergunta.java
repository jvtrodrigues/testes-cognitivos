package br.edu.ifrs.poa.lecc.testes.domain.enuns;

public enum TipoPergunta {
	LETRA("Letra"), ESCRITA("Escrita");
	
	private String desc;
	
	private TipoPergunta(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
