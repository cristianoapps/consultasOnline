package br.com.marcacao.consultasOnline.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.service.EspecialidadeService;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoResource {
	@Autowired
	private EspecialidadeService medicoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id) {

		Especialidade medico = medicoService.findById(id);
		return ResponseEntity.ok().body(medico);
		
	}
}
