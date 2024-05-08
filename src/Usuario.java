import java.util.Date;
import java.util.ArrayList;

public abstract class Usuario {

    String nome;
    String cpf;
    Date dataNascimento;
    static int id = 0;
    ArrayList<Livro> livrosAlugados;

    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id++;
    }

    boolean devolverLivro(Livro livro) {
        boolean devolvido = false;
        if(livrosAlugados.contains(livro)) {
            livrosAlugados.remove(livro);
            livro.numeroDeEmprestimos --;
            devolvido = true;
        }
        return devolvido;
    }

    boolean pegarLivro(Livro livro) {
        boolean pego = false;
        if(livro.quantidade - livro.numeroDeEmprestimos > 0) {
            livrosAlugados.add(livro);
            livro.numeroDeEmprestimos ++;
            pego = true;
        }
        else
            System.out.println("Livro indisponível");
        return pego;
    }

    void imprimirLivros(){
        System.out.println("Livros Alugados:\n");
        for(Livro livro : livrosAlugados){
            livro.imprimir();
        }
    }

}