package com.bibliotec.bibliotec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "alunos")
@Entity(name = "alunos")
public class Aluno extends Usuario{
    String escola;

    public Aluno(String nome, String cpf, Date dataNascimento, String escola) {
        super(nome, cpf, dataNascimento);
        this.escola = escola;
    }

    public boolean pegarLivro(Livro livro) {
        if (livrosAlugados.size() < 5) {
            livrosAlugados.add(livro);
            return true;
        } else {
            System.out.println("Limite máximo de livros alugados alcançado");
            return false;
        }
    }
}
