package br.com.marcacao.consultasOnline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.repositories.EspecialidadeRepository;
import br.com.marcacao.consultasOnline.service.exceptions.AplicacaoException;
import br.com.marcacao.consultasOnline.service.exceptions.DataIntegrityException;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class EspecialidadeService {

	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public Especialidade findById(Integer id) throws ObjectNotFoundException {
		Optional<Especialidade> especialidade = especialidadeRepository.findById(id);
		return especialidade.orElseThrow(() -> new AplicacaoException(
				"Objeto não encontrado ! id " + id + " Tipo: " + Especialidade.class.getName()));
	}

	public List<Especialidade> findAll() {
		List<Especialidade> especialidades = especialidadeRepository.findAll();
		return especialidades;
	}

	public Especialidade save(Especialidade especialidade) {
		return especialidadeRepository.save(especialidade);

	}

	public void deleteById(Integer id) throws ObjectNotFoundException {
		findById(id);
		try {
		especialidadeRepository.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir uma especialidade que está atrelada a um médico");
		}
	}
	
	
}
