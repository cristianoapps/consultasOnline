package br.com.marcacao.consultasOnline.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public enum SexoEnum {
	MASCULINO("M", "MASCULINO"), FEMININO("F", "FEMININO");

	@Getter
	@Setter
	private  String sigla;
	@Getter
	@Setter
	private  String descricao;


}
