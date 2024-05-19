package com.bibliotec.bibliotec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BibliotecaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam String nome, @RequestParam String cpf, Model model) {
        // Lógica de login aqui
        // Exemplo: verificar usuário e senha
        if ("admin".equals(nome) && "1234".equals(cpf)) {
            model.addAttribute("message", "Bem-vindo, " + nome);
            return "dashboard";
        } else {
            model.addAttribute("error", "Nome ou CPF inválido");
            return "index";
        }
    }

    // Outros métodos para manipular requisições como pegar e devolver livros
}
