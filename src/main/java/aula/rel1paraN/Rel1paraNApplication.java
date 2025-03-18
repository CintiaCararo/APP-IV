package aula.rel1paraN;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import aula.rel1paraN.modelo.Departamento;
import aula.rel1paraN.modelo.Funcionario;
import aula.rel1paraN.repositorio.DepartamentoRepositorio;
import aula.rel1paraN.repositorio.FuncionarioRepositorio;
import aula.rel1paraN.repositorio.ProjetoRepositorio;


//Isso garante que o Spring encontre os repositórios, mesmo que estejam em outro pacote.
@EnableJpaRepositories(basePackages = "aula.rel1paraN.repositorio")
@SpringBootApplication
public class Rel1paraNApplication implements CommandLineRunner{

	@Autowired
	DepartamentoRepositorio departamentoRepositorio;
	@Autowired
	FuncionarioRepositorio funcionarioRepositorio;
	@Autowired
	ProjetoRepositorio projetoRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(Rel1paraNApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Departamento> departamentos = departamentoRepositorio.findAll();
		for (Departamento d : departamentos) {
			System.out.println(d.getNome());
			System.out.println(d.getId());
			System.out.println(d.getFuncionarios());
		}


	}

}
