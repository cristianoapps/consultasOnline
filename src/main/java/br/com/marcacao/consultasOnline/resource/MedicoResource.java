package br.com.marcacao.consultasOnline.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcacao.consultasOnline.domain.Medico;
import br.com.marcacao.consultasOnline.service.MedicoService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoResource {
	@Autowired
	MedicoService medicoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable String id) throws ObjectNotFoundException {

		Medico medico = medicoService.findById(id);
		return ResponseEntity.ok().body(medico);
		
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() throws ObjectNotFoundException {

		List<Medico> medico = medicoService.findAll();
		return ResponseEntity.ok().body(medico);
		
	}
}
