package br.com.marcacao.consultasOnline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcacao.consultasOnline.domain.Medico;
import br.com.marcacao.consultasOnline.repositories.MedicoRepository;

@Service
public class MedicoService {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	public Medico findById(String id) {
		Optional<Medico> medico = medicoRepository.findById(id);
		return medico.orElse(null);
	}
	
	public List<Medico> findAll() {
		List<Medico> medicos = medicoRepository.findAll();
		return medicos;
	}
	
	public void saveAll(List<Medico> medicos) {
		medicoRepository.saveAll(medicos);
	}
	public Medico save(Medico medico) {
		medicoRepository.save(medico);
		return medico;
	}
	public void deleteAll() {
		medicoRepository.deleteAll();
	}
}
