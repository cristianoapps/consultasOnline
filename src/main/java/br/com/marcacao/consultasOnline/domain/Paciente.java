package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.marcacao.consultasOnline.enumeration.SexoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente implements Serializable {

	private static final long serialVersionUID = 436760398423496620L;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	private SexoEnum sexo;
	@OneToOne
	@JoinColumn
	private Usuario usuario;
}
