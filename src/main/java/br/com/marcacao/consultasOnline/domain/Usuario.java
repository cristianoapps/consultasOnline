package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.marcacao.consultasOnline.enumeration.TipoUsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

	private static final long serialVersionUID = -4556351808324388603L;
	private String cpfUsuario;
	private String email;
	private String senha;
	TipoUsuarioEnum tipoUsuario;
	@OneToMany
	@JoinColumn
	List<Contato> contatos = new ArrayList<>();

}
