package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Convenio implements Serializable {

	private static final long serialVersionUID = 8775643669288155639L;
	private Integer codigoConvenio;
	private String descricaoConvenio;
	SimNaoEnum isAtivo;
	@ManyToMany
	@JoinTable
	List<Plano> planos = new ArrayList<Plano>();
}
