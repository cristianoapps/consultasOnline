package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Agenda implements Serializable {

	private static final long serialVersionUID = 9131854008121083771L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_agenda")
	private Integer codigoAgenda;
	@JoinColumn(name = "cpf_medico")
	Medico medico;
	@ManyToMany
	@JoinTable(name = "AGENDA_CONVENIO", joinColumns = @JoinColumn(name = "cd_agenda"), inverseJoinColumns = @JoinColumn(name = "cd_convenio"))
	private List<Convenio> convenios = new ArrayList<>();	
	private Integer quantidadeAtendimentos;
	private LocalTime tempoConsulta;
	private Integer quantidadeEncaixes;
	private LocalTime horarioAtendimentoInicial;
	private LocalTime horarioAtendimentoFinal;
	private SimNaoEnum isAgendaDinamica;
	@OneToMany(mappedBy = "agenda")
	private List<ItemAgenda> itensAgenda = new ArrayList<>();

}
