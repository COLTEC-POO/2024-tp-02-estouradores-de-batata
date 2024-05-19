package com.bibliotec.bibliotec.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "professores")
@Entity(name = "professores")
public class Professor extends Usuario{
    String formacao;

    public Professor(String nome, String cpf, Date dataNascimento, String formacao) {
        super(nome, cpf, dataNascimento);
        this.formacao = formacao;
    }

    public boolean pegarLivro(Livro livro) {
        if (livrosAlugados.size() < 10) {
            livrosAlugados.add(livro);
            return true;
        } else {
            System.out.println("Limite máximo de livros alugados alcançado");
            return false;
        }
    }
}
