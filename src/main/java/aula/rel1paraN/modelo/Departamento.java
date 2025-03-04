package aula.rel1paraN.modelo;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String nome;

    @Column(length = 200)
    private String localizacao;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionarios;

    @OneToMany(mappedBy = "departamento")
    private List<Projeto> projetos;

}