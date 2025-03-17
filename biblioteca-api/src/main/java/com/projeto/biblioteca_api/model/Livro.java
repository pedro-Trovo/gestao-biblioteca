package com.projeto.biblioteca_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String titulo;

    @NotNull
    @Column(nullable = false)
    private String autor;

    @NotNull
    @Column(unique = true, nullable = false)
    private String isbn;

    private Integer anoPublicacao;

    @NotNull
    @Column(nullable = false)
    private Boolean disponivel = true; // Por padrão, livro está disponível

}

