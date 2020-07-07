package br.com.marcacao.consultasOnline.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcacao.consultasOnline.domain.Especialidade;

@RestController
@RequestMapping(value = "/especialidades")
public class EspecialidadeResource {

	private Especialidade especialidade1 = new Especialidade();
	private Especialidade especialidade2 = new Especialidade();

	@RequestMapping(method = RequestMethod.GET)

	public List<Especialidade> listar() {
		especialidade1.setCdEspecialidade(1);
		especialidade1.setDsEspecialidade("Cardiologia");
		especialidade2.setCdEspecialidade(2);
		especialidade2.setDsEspecialidade("Oftalmologia");

		List<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(especialidade1);
		especialidades.add(especialidade2);

		return especialidades;
	}
}
