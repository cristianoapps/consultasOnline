package br.com.marcacao.consultasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcacao.consultasOnline.domain.Convenio;

@Repository
public interface ConvenioRepository extends JpaRepository<Convenio, Integer>{
	
}
