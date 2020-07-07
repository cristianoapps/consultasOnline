package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.marcacao.consultasOnline.enumeration.SexoEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Medico implements Serializable{

	private static final long serialVersionUID = -5480352003974156067L;
	@Id
	@NonNull
	private String cpf;
	@Column(name = "nm_medico", nullable = false)
	@NonNull
	private String nome;
	@Column(name = "dt_nascimento", nullable = false)
	@NonNull
	private LocalDate dataNascimento;
	@Column(name = "nm_mae", nullable = false)
	@NonNull
	private String nomeMae;
	@Column(name = "sexo", nullable = false)
	@NonNull
	private SexoEnum sexo;
	@Column(name = "crm", nullable = false)
	@NonNull
	private String crm;
	
	@ManyToMany
	@JoinTable(name = "ESPECIALIDADE_MEDICO",
        joinColumns = @JoinColumn(name = "cpf_medico"),
   inverseJoinColumns = @JoinColumn(name = "cd_especialidade")
	)
	private List<Especialidade> especialidades = new  ArrayList<>();
	
	

}
