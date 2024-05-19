package com.bibliotec.bibliotec.service;

import com.bibliotec.bibliotec.model.Morador;
import com.bibliotec.bibliotec.model.Livro;
import com.bibliotec.bibliotec.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoradorService {

    @Autowired
    private MoradorRepository moradorRepository;

    public boolean pegarLivro(Long moradorId, Livro livro) {
        Optional<Morador> optionalMorador = moradorRepository.findById(moradorId);
        if (optionalMorador.isPresent()) {
            Morador morador = optionalMorador.get();
            return morador.pegarLivro(livro);
        } else {
            System.out.println("Aluno não encontrado");
            return false;
        }
    }
}
