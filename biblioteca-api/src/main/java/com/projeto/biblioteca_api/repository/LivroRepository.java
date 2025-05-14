package com.projeto.biblioteca_api.repository;

import com.projeto.biblioteca_api.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByTituloContainingIgnoreCaseOrAutorContainingIgnoreCase(String titulo, String autor);

    Optional<Livro> findByIsbn(String isbn);

    List<Livro> findByAnoPublicacao(Integer ano);
}
