package com.projeto.biblioteca_api.controller;

import com.projeto.biblioteca_api.model.Livro;
import com.projeto.biblioteca_api.service.LivroService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public String cadastrar(@RequestBody Livro livro) {
        livroService.salvar(livro);
        return "Livro '" + livro.getTitulo() + "' cadastrado com sucesso!";
    }

    @PutMapping
    public String atualizar(@RequestBody Livro livro) {
        livroService.atualizar(livro);
        return "Livro '" + livro.getTitulo() + "' atualizado com sucesso!";
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        livroService.deletar(id);
        return "Livro com ID " + id + " removido com sucesso!";
    }

    @GetMapping
    public List<Livro> listarTodos() {
        return livroService.listarTodos();
    }

    @GetMapping("/busca/{termo}")
    public List<Livro> buscarPorTermo(@PathVariable String termo) {
        return livroService.buscarPorTermo(termo);
    }

    @GetMapping("/isbn/{isbn}")
    public Livro buscarPorIsbn(@PathVariable String isbn) {
        return livroService.buscarPorIsbn(isbn);
    }

    @GetMapping("/ano/{ano}")
    public List<Livro> buscarPorAno(@PathVariable Integer ano) {
        return livroService.buscarPorAno(ano);
    }

    @PutMapping("/emprestar/{id}")
    public ResponseEntity<String> emprestar(@PathVariable Long id) {
        livroService.emprestar(id);
        return ResponseEntity.ok("Livro emprestado com sucesso");
    }
    
    @PutMapping("/devolver/{id}")
    public ResponseEntity<String> devolver(@PathVariable Long id) {
        livroService.devolver(id);
        return ResponseEntity.ok("Livro devolvido com sucesso");
    }
}