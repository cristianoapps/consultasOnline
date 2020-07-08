package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = -1916696934267040101L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_contato")
	private Integer codigoContato;
	@Column(name = "nr_celular")
	private String celular;
	@Column(name = "nr_telefone")
	private String telefone;	
	private String email;
	@JsonBackReference
	@ManyToMany(mappedBy = "contatos")
	private List<Paciente> pacientes = new ArrayList<>();
	@ManyToMany(mappedBy = "contatos")
	private List<Medico> medicos = new ArrayList<>();
	
}
