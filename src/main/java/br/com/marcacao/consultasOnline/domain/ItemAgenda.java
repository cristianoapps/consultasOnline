package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemAgenda implements Serializable {

	private static final long serialVersionUID = 2222500811731336380L;
	private Integer codigoItemAgenda;
	@OneToOne
	@JoinColumn
	private Agenda agenda;
	private LocalDate dataAtendimento;
	private LocalTime horaAtendimento;
}
