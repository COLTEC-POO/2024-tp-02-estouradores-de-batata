package com.bibliotec.bibliotec.service;

import com.bibliotec.bibliotec.model.Aluno;
import com.bibliotec.bibliotec.model.Livro;
import com.bibliotec.bibliotec.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public boolean pegarLivro(Long alunoId, Livro livro) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(alunoId);
        if (optionalAluno.isPresent()) {
            Aluno aluno = optionalAluno.get();
            return aluno.pegarLivro(livro);
        } else {
            System.out.println("Aluno não encontrado");
            return false;
        }
    }
}
