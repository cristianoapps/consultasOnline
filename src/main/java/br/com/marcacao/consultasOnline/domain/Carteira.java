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

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Carteira implements Serializable {

	private static final long serialVersionUID = 4616874785361911081L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_sequencial_carteira")
	private Integer codigoSequencialCarteira;
	@ManyToMany
	@JoinTable(name = "CARTEIRA_CONVENIO", joinColumns = @JoinColumn(name = "cd_sequencial_carteira"), inverseJoinColumns = @JoinColumn(name = "cd_convenio"))
	List<Convenio> convenios = new ArrayList<>();
	private String numeroCarteira;
	@Column(name = "dt_validade")
	private String dataValidade;
	@Column(name = "sn_ativo")
	private SimNaoEnum isAtivo;

}
