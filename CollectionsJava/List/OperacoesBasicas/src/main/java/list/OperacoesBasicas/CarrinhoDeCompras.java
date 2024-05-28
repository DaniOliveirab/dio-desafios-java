package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
      List<Item> itensParaRemover = new ArrayList<>();
      if (!itemList.isEmpty()) {
        for (Item i : itemList) {
          if (i.getNome().equalsIgnoreCase(nome)) {
            itensParaRemover.add(i);
          }
        }
        itemList.removeAll(itensParaRemover);
      } else {
        System.out.println("A lista vazia!");
      }
  
    }

    public double calcularValorTotal() {
      double valorTotal = 0d;
      if (!itemList.isEmpty()) {  
        for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; 
        }
        return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
    }

    public void exibirItens() {
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
        } else {
      System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
    }

    public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Vestido", 20d, 1);
    carrinhoDeCompras.adicionarItem("Vestido", 20d, 3);
        carrinhoDeCompras.adicionarItem("Bota", 169.9d, 1);
        carrinhoDeCompras.adicionarItem("Jaqueta", 79.9d, 2);

    // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Vestido");

    // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra: " + carrinhoDeCompras.calcularValorTotal());
    }
}
