package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToMany;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plano implements Serializable {

	private static final long serialVersionUID = -5036878941219590142L;
	private Integer codigoPlano;
	private String descricaoPlano;
	private SimNaoEnum isAtivo;
	@ManyToMany(mappedBy = "planos")
	List<Convenio> convenios = new ArrayList<>();
}
