package br.edu.ifrs.poa.lecc.testes.domain.enuns;

public enum StatusResposta {
	ERRADA("Errada"), CERTA("Certa"), NAO_RESPONDIDA("Não Respondida");
	
	private String desc;
	
	private StatusResposta(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
