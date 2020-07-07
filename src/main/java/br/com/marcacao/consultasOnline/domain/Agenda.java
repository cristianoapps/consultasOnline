package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agenda implements Serializable {

	private static final long serialVersionUID = 9131854008121083771L;
	private Integer codigoAgenda;
	@OneToOne
	@JoinColumn
	Medico medico;
	@OneToMany
	@JoinColumn
	List<Convenio> convenios = new ArrayList<>();
	private Integer quantidadeAtendimentos;
	private LocalTime tempoConsulta;
	private Integer quantidadeEncaixes;
	private LocalTime horarioAtendimentoInicial;
	private LocalTime horarioAtendimentoFinal;
	private SimNaoEnum isAgendaDinamica;
	private List<ItemAgenda> itensAgenda = new ArrayList<>();

}
