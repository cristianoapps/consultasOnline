package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paciente implements Serializable {

	private static final long serialVersionUID = 436760398423496620L;
	@Id
	private String cpf;
	@Column(name = "nm_paciente")
	private String nome;
	@Column(name = "dt_nascimento")
	private LocalDate dataNascimento;
	private SexoEnum sexo;
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	@ManyToMany
	@JoinTable(name = "CONTATO_PACIENTE", joinColumns = @JoinColumn(name = "cpf_paciente"), inverseJoinColumns = @JoinColumn(name = "cd_contato"))
	private List<Contato> contatos = new ArrayList<>();

}
