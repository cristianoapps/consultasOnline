package br.com.marcacao.consultasOnline.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public enum TipoUsuarioEnum {
	MEDICO("M", "MEDICO"), PACIENTE("P", "PACIENTE");

	@Getter
	@Setter
	private String sigla;
	@Getter
	@Setter
	private String descricao;

}
