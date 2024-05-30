package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigoProduto, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigoProduto, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorpreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorpreco) {
                produtoMaisCaro = p;
                maiorpreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
          if (p.getPreco() < menorPreco) {
            produtoMaisBarato = p;
            menorPreco = p.getPreco();
          }
        }
        return produtoMaisBarato;
      }

      public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        System.out.println("EXIBIR ESTOQUE VAZIO");
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        System.out.println("ADICIONANDO PRODUTOS");
        estoque.adicionarProduto(1L, "Notebook", 1500.0, 1);
        estoque.adicionarProduto(2L, "Mouse", 25.0, 5);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 10);
        estoque.adicionarProduto(4L, "Teclado", 40.0, 2);
    
        // Exibe os produtos no estoque
        System.out.println("EXIBINDO PRODUTOS DEPOS DE ADICIONAR");
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("CALCULANDO VALOR TOTAL DO ESTOQUE");
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        System.out.println("OBTENDO O VALOR DO PRODUTO MAIS CARO");
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        System.out.println("OBTENDO O VALOR DO PRODUTO MAIS BARATO");
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        
      }  
}
