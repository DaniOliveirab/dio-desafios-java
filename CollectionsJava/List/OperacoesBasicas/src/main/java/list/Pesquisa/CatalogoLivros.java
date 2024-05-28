package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicaçao() >= anoInicial && l.getAnoPublicaçao() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2003);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2004);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2005);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2005);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2006);

        System.out.println("Livros por Autor 2: " + catalogoLivros.pesquisarAutor("Autor 2"));
        System.out.println("Livros publicados entre 2003 e 2005: " + catalogoLivros.pesquisaPorIntervaloAno(2003, 2005));
        System.out.println("Livro com título 'Livro 1': " + catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
