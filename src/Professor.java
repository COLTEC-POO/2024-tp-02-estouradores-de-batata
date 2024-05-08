import java.util.Date;

public class Professor extends Usuario{

    String formacao;

    public Professor(String nome, String cpf, Date dataNascimento, String formacao) {
        super(nome, cpf, dataNascimento);
        this.formacao = formacao;
    }

    boolean pegarLivro(Livro livro){
        boolean pego = false;
        if(livrosAlugados.size() < 10)
            pego = super.pegarLivro(livro);
        else
            System.out.println("Limite máximo de livros alugados alcançado");
        return pego;
    }
}