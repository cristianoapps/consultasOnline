package br.com.marcacao.consultasOnline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.repositories.EspecialidadeRepository;

@Service
public class EspecialidadeService {

	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public Especialidade findById(Integer id)  {
		Optional<Especialidade> especialidade = especialidadeRepository.findById(id);
		return especialidade.orElse(null);
	}

	public List<Especialidade> findAll() {
		List<Especialidade> especialidades = especialidadeRepository.findAll();
		return especialidades;
	}

	public void saveAll(List<Especialidade> especialidades) {
		especialidadeRepository.saveAll(especialidades);
	}

	public Especialidade save(Especialidade especialidade) {
		especialidadeRepository.save(especialidade);
		return especialidade;
	}

	public void deleteAll() {
		especialidadeRepository.deleteAll();
	}
}
