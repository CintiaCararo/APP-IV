package aula.rel1paraN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import aula.rel1paraN.repositorio.UsuarioRepositorio;


//Isso garante que o Spring encontre os repositórios, mesmo que estejam em outro pacote.
@EnableJpaRepositories(basePackages = "aula.rel1paraN.repositorio")
@SpringBootApplication
public class Rel1paraNApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(Rel1paraNApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// criar os objetos aqui

	}

}
