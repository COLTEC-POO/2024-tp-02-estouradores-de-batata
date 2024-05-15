

public class Livro {
    String titulo;
    String autor;
    int AnoDePublicacao;
    String editora;
    int quantidade;
    int numeroDeEmprestimos;

    public Livro(String titulo, int numeroDeEmprestimos, int quantidade, String editora, int anoDePublicacao, String autor) {
        this.titulo = titulo;
        this.numeroDeEmprestimos = numeroDeEmprestimos;
        this.quantidade = quantidade;
        this.editora = editora;
        this.AnoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }

    public void imprimir(){
        System.out.println("Metatados\nTítulo do Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + AnoDePublicacao);
        System.out.println("Editora:" + editora);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Número de emprestimos: " + numeroDeEmprestimos);
    }
}