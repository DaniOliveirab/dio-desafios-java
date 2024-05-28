package main.java.list.Ordenação;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas>{
    //atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "PESSOA\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\n";
    }

}

/**
 * ComparatorPorAltura 
 */
