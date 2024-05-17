import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    ArrayList<Livro> livro;
    ArrayList<Usuario> usuario;
    private String nome;

    void cadastroUsuario(String profissao, String nome, String CPF, String escola, Date dataNascimento, String formacao) {
        Usuario novoUsuario = null;
        switch (profissao) {
            case "aluno":
                novoUsuario = new Aluno(nome, CPF, dataNascimento, escola);
                break;
            case "professor":
                novoUsuario = new Professor(nome, CPF, dataNascimento, formacao);
                break;
            case "morador":
                novoUsuario = new Morador(nome, CPF, dataNascimento);
                break;
            default:
                System.out.println("Tipo de usuário inválido!");
                break;
        }
        if (novoUsuario != null) {
            usuario.add(novoUsuario);
            System.out.println("Usuário cadastrado com sucesso!");
        }

    }

    void cadastroLivro(String titulo, String autor, String editora, int AnoDePublicacao, int quantidade, int numeroDeEmprestimos) {
        Livro livros = new Livro(titulo, numeroDeEmprestimos, quantidade, editora, AnoDePublicacao, autor);
        if (livro != null) {
            livro.add(livros);
            System.out.println("Usuário cadastrado com sucesso!");
        }
    }

    void imprimirLivros() {
        System.out.println("Livros:");
            for(Livro livro : livro){
                livro.imprimir();
            }
    }

    void realizarDevolucao(Usuario usuario, Livro livro) {
        usuario.devolverLivro(livro);
    }

    void realizarEmprestimo() {

    }

}/*void realizarEmprestimo(): deverá inicializar o processo de empréstimo

void realizarDevolucao(): deverá iniciar o processo de devolução

void imprimirLivros(): deverá imprimir todos os livros disponíveis na biblioteca


*/
