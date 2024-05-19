package com.bibliotec.bibliotec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "moradores")
@Entity(name = "moradores")
public class Morador extends Usuario{
    public Morador(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public boolean pegarLivro(Livro livro) {
        if (livrosAlugados.size() < 2) {
            livrosAlugados.add(livro);
            return true;
        } else {
            System.out.println("Limite máximo de livros alugados alcançado");
            return false;
        }
    }
}
