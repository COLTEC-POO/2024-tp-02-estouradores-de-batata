package com.bibliotec.bibliotec.model;

import jakarta.persistence.*;


@Table(name = "livros")
@Entity(name = "livros")
public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String titulo;
    String autor;
    int AnoDePublicacao;
    String editora;
    int quantidade;
    boolean existo;
}
