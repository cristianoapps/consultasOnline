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

	public Especialidade buscar(Integer id) {
		Optional<Especialidade> especialidade = especialidadeRepository.findById(id);
		return especialidade.orElse(null);
	}
	
	public List<Especialidade> buscar() {
		List<Especialidade> especialidades = especialidadeRepository.findAll();
		return especialidades;
	}
	
	public void incluirTodos(List<Especialidade> especialidades) {
		especialidadeRepository.saveAll(especialidades);
	}
	public Especialidade incuir(Especialidade especialidade) {
		especialidadeRepository.save(especialidade);
		return especialidade;
	}
}
