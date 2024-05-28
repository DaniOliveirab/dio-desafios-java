package main.java.list.Ordenação;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoas> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        List<Pessoas> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoas> ordenarPorAltura() {
        List<Pessoas> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
          OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
      
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          System.out.println("ORDENAR PESSOA");
          System.out.println(ordenacaoPessoas.pessoaList);

          System.out.println("ORDENAR PESSOA POR IDADE");
          System.out.println(ordenacaoPessoas.ordenarPorIdade());

          System.out.println("ORDENAR PESSOA POR ALTURA");
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
}