import java.util.Date;
import java.util.ArrayList;

public class Usuario {

    String nome;
    String cpf;
    Date dataNascimento;
    static int id = 0;
    ArrayList<Livro> livrosAlugados  = new ArrayList<>();;

    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        id = id++;
    }

    boolean devolverLivro(Livro livro) {
        boolean devolvido = false;
        if(livrosAlugados.contains(livro)) {
            livro.setQuantidade(1);
            livrosAlugados.remove(livro);
            devolvido = true;
        }
        return devolvido;
    }

    boolean pegarLivro(Livro livro) {
        boolean pego = false;
        if(livro.quantidade > 0) {
            livro.setQuantidade(-1);
            livrosAlugados.add(livro);
            pego = true;
        }
        else if(livro.quantidade == 0) {
            System.out.println("Todas as copias ja foram alugadas...");
        } else
            System.out.println("Não temos esse livro ou não existe...");
        return pego;
    }

    void imprimirLivros(boolean amount){
        System.out.println("-------Livros Alugados-------");
        for(Livro livro : livrosAlugados){
            livro.imprimir(amount);
        }
        System.out.println("-----------------------------");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getId() {
        return id;
    }

}
/*import java.util.Date;
import java.util.ArrayList;

public class Usuario {

    String nome;
    String cpf;
    Date dataNascimento;
    static int id = 0;
    ArrayList<Livro> livrosAlugados;

    public Usuario(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        id = id++;
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

} */