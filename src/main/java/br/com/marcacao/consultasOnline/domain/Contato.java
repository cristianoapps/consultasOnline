package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contato implements Serializable {

	private static final long serialVersionUID = -1916696934267040101L;
	private Integer codigoContato;
	private String celular;
	private String telefone;
	private String email;
	@OneToOne
	@JoinColumn
	private Usuario usuario;
}
