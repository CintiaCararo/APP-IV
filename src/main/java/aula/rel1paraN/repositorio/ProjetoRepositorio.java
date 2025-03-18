package aula.rel1paraN.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aula.rel1paraN.modelo.Projeto;

@Repository
public interface ProjetoRepositorio extends JpaRepository<Projeto, Long>{
    
}
