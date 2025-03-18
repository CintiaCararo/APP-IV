package aula.rel1paraN.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aula.rel1paraN.modelo.Departamento;

@Repository                                                   //TipoObjeto  , TipoChave
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long>{
    
}
