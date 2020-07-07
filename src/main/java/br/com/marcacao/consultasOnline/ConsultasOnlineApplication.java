package br.com.marcacao.consultasOnline;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.marcacao.consultasOnline.domain.Especialidade;
import br.com.marcacao.consultasOnline.service.EspecialidadeService;

@SpringBootApplication
public class ConsultasOnlineApplication implements CommandLineRunner {
	@Autowired
	private EspecialidadeService especialidadeService;

	public static void main(String[] args) {
		SpringApplication.run(ConsultasOnlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Especialidade especialidade1 = new Especialidade(null, "CARDIOLOGIA");
		Especialidade especialidade2 = new Especialidade(null, "OFTALMOLOGIA");
		especialidadeService.incluirTodos(Arrays.asList(especialidade1, especialidade2));
	}

}
