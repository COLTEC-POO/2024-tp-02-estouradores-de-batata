package com.bibliotec.bibliotec.service;

import com.bibliotec.bibliotec.model.Professor;
import com.bibliotec.bibliotec.model.Livro;
import com.bibliotec.bibliotec.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public boolean pegarLivro(Long professorId, Livro livro) {
        Optional<Professor> optionalProfessor = professorRepository.findById(professorId);
        if (optionalProfessor.isPresent()) {
            Professor professor = optionalProfessor.get();
            return professor.pegarLivro(livro);
        } else {
            System.out.println("Professor não encontrado");
            return false;
        }
    }
}
