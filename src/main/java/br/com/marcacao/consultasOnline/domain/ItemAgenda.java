package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemAgenda implements Serializable {

	private static final long serialVersionUID = 2222500811731336380L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_item_agenda")
	private Integer codigoItemAgenda;
	@ManyToOne
	@JoinColumn(name = "cd_agenda")
	private Agenda agenda;
	private LocalDate dataAtendimento;
	private LocalTime horaAtendimento;
}
