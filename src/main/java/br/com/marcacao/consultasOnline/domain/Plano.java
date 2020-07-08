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

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.marcacao.consultasOnline.enumeration.SimNaoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Plano implements Serializable {

	private static final long serialVersionUID = -5036878941219590142L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_plano")
	private Integer codigoPlano;
	@Column(name = "ds_plano")
	private String descricaoPlano;
	private SimNaoEnum isAtivo;
	@JsonIgnore
	@ManyToMany(mappedBy = "planos")
	List<Convenio> convenios = new ArrayList<>();
}
