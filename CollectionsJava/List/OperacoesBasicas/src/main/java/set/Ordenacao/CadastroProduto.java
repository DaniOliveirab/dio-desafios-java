package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigoProduto, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigoProduto, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProdutos = new CadastroProduto();
    
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        System.out.println(cadastroProdutos.produtoSet);
    
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
    
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
      }
    
}
