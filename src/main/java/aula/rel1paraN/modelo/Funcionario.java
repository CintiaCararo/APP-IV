package aula.rel1paraN.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15)
    private String cpf;


    @Column(length = 200)
    private String nome;

    @Column(name="eh_gerente")
    private Boolean ehGerente;

    //@JoinColumn(name = "idDepartamento")
    // Define o nome da coluna no banco de dados que armazenará a chave estrangeira.
    //referencedColumnName = "id"
    // Define a coluna da tabela referenciada que será usada como chave primária.
    //Se referencedColumnName for omitido, ele assume automaticamente a chave primária da entidade referenciada.
    @ManyToOne
    @JoinColumn(name = "idDepartamento", referencedColumnName="id")
    private Departamento departamento;


}