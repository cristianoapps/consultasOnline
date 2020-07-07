package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Especialidade implements Serializable {

	private static final long serialVersionUID = -6608138977020921513L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_especialidade",nullable = false)
	private Integer codigoEspecialidade;
	@Column(name = "ds_especialidade",nullable = false) 
	private String descricaoEspecialidade;
}
