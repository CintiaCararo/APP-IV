package aula.rel1paraN.repositorio;

import aula.rel1paraN.modelo.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
}

