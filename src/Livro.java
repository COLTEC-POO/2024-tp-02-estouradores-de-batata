
public class Livro {
    String titulo;
    String autor;
    int AnoDePublicacao;
    String editora;
    int quantidade;

    public Livro(String titulo, int quantidade, String editora, int birth, String autor) {
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.editora = editora;
        this.AnoDePublicacao = birth;
        this.autor = autor;
    }

    public void imprimir(boolean amount){
        System.out.println("Livro:" + titulo + " de: " + autor);
        System.out.println("Em: " + AnoDePublicacao + " Pela Editora:" + editora);

        //nem sempre eu quero que a quantidade seja visivel
        if(amount) {
            System.out.println("Quantidade: " + quantidade);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
}