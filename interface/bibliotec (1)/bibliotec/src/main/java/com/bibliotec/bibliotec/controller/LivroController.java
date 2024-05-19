// LivroController.java
package com.bibliotec.bibliotec.controller;

import com.bibliotec.bibliotec.model.Livro;
import com.bibliotec.bibliotec.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAllLivros() {

        return livroService.findAll();
    }

    @PostMapping
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    /*@DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id) {
        livroService.deleteById(id);
    }*/
}
