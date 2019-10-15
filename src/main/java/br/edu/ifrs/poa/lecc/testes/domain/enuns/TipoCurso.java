package br.edu.ifrs.poa.lecc.testes.domain.enuns;

public enum TipoCurso {
	TECNICO("Técnico"), SUPERIOR("Superior"), MEDIO_INTEGRADO("Médio Integrado"), MESTRADO("Mestrado");
	private String desc;
	
	private TipoCurso(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
