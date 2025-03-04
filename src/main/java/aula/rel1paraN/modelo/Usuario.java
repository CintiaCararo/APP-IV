package aula.rel1paraN.modelo;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indica que esta classe é uma entidade gerenciada pelo JPA
@Table(name = "usuarios") // Especifica o nome da tabela no banco de dados

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente (auto-incremento)
    private Long id;

    @Column(nullable = false, length = 100) // Define propriedades da coluna
    private String nome;

    @Column(nullable = false, unique = true) // Valor único para o email
    private String email;

    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String senha;

    // Construtor vazio (necessário para JPA)
    public Usuario() {}

    // Construtor com argumentos
    public Usuario(String nome, String email, LocalDate dataNascimento, String senha) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
