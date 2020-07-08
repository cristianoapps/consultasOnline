package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Convenio implements Serializable {

	private static final long serialVersionUID = 8775643669288155639L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_convenio")
	private Integer codigoConvenio;
	@Column(name = "nm_convenio")
	private String descricaoConvenio;
	SimNaoEnum isAtivo;
	@JsonManagedReference
	@ManyToMany
	@JoinTable(name = "CONVENIO_PLANO", joinColumns = @JoinColumn(name = "cd_convenio"), inverseJoinColumns = @JoinColumn(name = "cd_plano"))
	List<Plano> planos = new ArrayList<Plano>();
	@JsonBackReference
	@ManyToMany(mappedBy = "convenios")
	private List<Carteira> carteiras = new ArrayList<>();
	@ManyToMany(mappedBy = "convenios")
	private List<Agenda> agendas = new ArrayList<>();
}
