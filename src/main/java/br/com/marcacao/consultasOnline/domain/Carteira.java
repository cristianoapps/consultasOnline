package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carteira implements Serializable {

	private static final long serialVersionUID = 4616874785361911081L;
	private Integer codigoSequencialCarteira;
	@OneToOne
	@JoinColumn
	Convenio convenio;
	private String numeroCarteira;
	private String dataValidade;
	private SimNaoEnum isAtivo;

}
