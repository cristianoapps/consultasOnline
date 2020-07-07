package br.com.marcacao.consultasOnline.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public enum SimNaoEnum {
	SIM("S", "SIM"), NAO("N", "NAO");

	@Getter
	@Setter
	private String sigla;
	@Getter
	@Setter
	private String descricao;

}
