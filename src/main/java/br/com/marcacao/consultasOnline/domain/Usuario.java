package br.com.marcacao.consultasOnline.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.marcacao.consultasOnline.enumeration.TipoUsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -4556351808324388603L;
	@Id	
	@Column(name = "cpf_usuario")
	private String cpfUsuario;
	private String email;
	private String senha;
	@Column(name = "tipo_usuario")
	TipoUsuarioEnum tipoUsuario;
	
}
