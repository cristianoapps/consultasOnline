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

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Especialidade implements Serializable {

	private static final long serialVersionUID = -6608138977020921513L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_especialidade", nullable = false)
	private Integer codigoEspecialidade;
	@Column(name = "ds_especialidade", nullable = false)
	@NonNull
	private String descricaoEspecialidade;
	@ManyToMany(mappedBy = "especialidades")
	private List<Medico> medicos = new ArrayList<>();
}
