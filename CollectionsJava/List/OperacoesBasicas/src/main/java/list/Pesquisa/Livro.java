package main.java.list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicaçao;

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicaçao=" + anoPublicaçao + "]";
    }

    public Livro(String titulo, String autor, int anoPublicaçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaçao = anoPublicaçao;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicaçao() {
        return anoPublicaçao;
    }

    public String getTitulo() {
        return titulo;
    }
}
