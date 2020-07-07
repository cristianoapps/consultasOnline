package br.com.marcacao.consultasOnline.enumeration;

public enum SexoEnum {
	MASCULINO("M", "MASCULINO"), FEMININO("F", "FEMININO");

	private final String sigla;
	private final String descricao;

	SexoEnum(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

}
