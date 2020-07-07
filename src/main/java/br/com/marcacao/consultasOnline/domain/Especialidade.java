package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Especialidade implements Serializable {

	private static final long serialVersionUID = -6608138977020921513L;
	private Integer cdEspecialidade;
	private String dsEspecialidade;
}
