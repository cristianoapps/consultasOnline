package br.com.marcacao.consultasOnline;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.domain.Medico;
import br.com.marcacao.consultasOnline.enumeration.SexoEnum;
import br.com.marcacao.consultasOnline.service.EspecialidadeService;
import br.com.marcacao.consultasOnline.service.MedicoService;

@SpringBootApplication
public class ConsultasOnlineApplication implements CommandLineRunner {
	@Autowired
	private EspecialidadeService especialidadeService;
	@Autowired
	private MedicoService medicoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultasOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Especialidade> especialidades = new ArrayList<Especialidade>();
		List<Medico> medicos = new ArrayList<Medico>();
		
    	Especialidade especialidade1 = new Especialidade("CARDIOLOGIA");
		Especialidade especialidade2 = new Especialidade("OFTALMOLOGIA");		

		Medico medico1 = new Medico("11408748614","JOSUALDO EUSEBIO",LocalDate.of(1960,05,14),"MARIA DA SILVA",SexoEnum.MASCULINO,"26126");
		Medico medico2 = new Medico("75863804653","SUELI SEIXAS",LocalDate.of(1968,07,19),"ADELIA MARIA",SexoEnum.FEMININO,"26126");
		medicos.addAll(Arrays.asList(medico1,medico2));		
						
		especialidade1.getMedicos().add(medico1);
		especialidade2.getMedicos().add(medico2);
		medico1.getEspecialidades().add(especialidade1);
		medico2.getEspecialidades().add(especialidade2);
		/*
		especialidades.addAll(Arrays.asList(especialidade1,especialidade2));
		especialidadeService.deleteAll();
		especialidadeService.saveAll(Arrays.asList(especialidade1, especialidade2));
		medicoService.deleteAll();
		medicoService.saveAll(Arrays.asList(medico1,medico2));*/
	}

}
