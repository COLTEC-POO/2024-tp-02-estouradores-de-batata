import java.util.Date;

public class Livro {
    String titulo;
    String autor;
    Date AnoDePublicacao;
    String editora;
    int quantidade;
    int numeroDeEmprestimos;
    public void imprimir(){
        System.out.println("Metatados\nTítulo do Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + AnoDePublicacao);
        System.out.println("Editora:" + editora);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Número de emprestimos: " + numeroDeEmprestimos);
    }
}