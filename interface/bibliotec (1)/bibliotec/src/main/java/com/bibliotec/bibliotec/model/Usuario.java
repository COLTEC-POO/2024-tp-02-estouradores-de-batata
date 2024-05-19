package com.bibliotec.bibliotec.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.ArrayList;


public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nome;
    String cpf;
    Date dataNascimento;
    ArrayList<Livro> livrosAlugados  = new ArrayList<>();
    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
