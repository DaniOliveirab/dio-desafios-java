package main.java.set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //atributo
    private String nome;
    private long codigoProduto;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, long codigoProduto, double preco, int quantidade) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "PRODUTO \nNome: " + nome + "\nCodigo do Produto: " + codigoProduto + "\nPreco:" + preco + "\nQuantidade: "
                + quantidade + "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigoProduto ^ (codigoProduto >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoProduto != other.codigoProduto)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }


}
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}