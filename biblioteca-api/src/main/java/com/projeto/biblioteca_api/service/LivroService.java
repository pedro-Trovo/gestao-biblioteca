package com.projeto.biblioteca_api.service;

import com.projeto.biblioteca_api.model.Livro;
import com.projeto.biblioteca_api.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public void salvar(Livro livro) {
        livroRepository.save(livro);
    }

    public void atualizar(Livro livro) {
        if (livro.getId() != null && livroRepository.existsById(livro.getId())) {
            livroRepository.save(livro);
        } else {
            throw new RuntimeException("Livro não encontrado para atualizar");
        }
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public void deletar(Long id) {
        if (livroRepository.existsById(id)) {
            livroRepository.deleteById(id);
        } else {
            throw new RuntimeException("Livro não encontrado para excluir");
        }
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public List<Livro> buscarPorTermo(String termo) {
        return livroRepository.findByTituloContainingIgnoreCaseOrAutorContainingIgnoreCase(termo, termo);
    }

    public Livro buscarPorIsbn(String isbn) {
        return livroRepository.findByIsbn(isbn)
                .orElseThrow(() -> new RuntimeException("Livro com ISBN não encontrado"));
    }

    public List<Livro> buscarPorAno(Integer ano) {
        return livroRepository.findByAnoPublicacao(ano);
    }
}

