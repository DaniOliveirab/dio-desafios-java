package main.java.set.OperacoesBasicas;

public class Convidados {
    //atributos
    private String nome;
    private int codigoConvite;

    public Convidados(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "CONVIDADOS \nNome:" + nome + "\n Codigo do Convite:" + codigoConvite + "\n";
    }

    
}
