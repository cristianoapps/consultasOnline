package br.com.marcacao.consultasOnline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcacao.consultasOnline.domain.ItemAgenda;

@Repository
public interface ItemAgendaRepository extends JpaRepository<ItemAgenda, Integer>{
	
}
