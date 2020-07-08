package br.com.marcacao.consultasOnline.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.service.EspecialidadeService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/especialidades")
public class EspecialidadeResource {
	@Autowired
	private EspecialidadeService especialidadeService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) throws ObjectNotFoundException {
		Especialidade especialidade = especialidadeService.findById(id);
		return ResponseEntity.ok().body(especialidade);

	}

	@GetMapping
	public ResponseEntity<?> findAll() {

		List<Especialidade> especialidades = especialidadeService.findAll();
		return ResponseEntity.ok().body(especialidades);

	}
	
	@PostMapping
	public ResponseEntity<Especialidade> save(@RequestBody Especialidade especialidade) {
		Especialidade especialidadeSalva = especialidadeService.save(especialidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(especialidadeSalva.getCodigoEspecialidade()).toUri();
		return ResponseEntity.created(uri).build();
	}

	public void delete(Especialidade especialidade) {
		especialidadeService.delete(especialidade);
	}
}
