package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidados {
    //atributo
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidados convidadoParaRemover = null;
        for(Convidados c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        conjuntoConvidados.adicionarConvidados("Alice", 1234);
        conjuntoConvidados.adicionarConvidados("Bob", 1235);
        conjuntoConvidados.adicionarConvidados("Charlie", 1235);
        conjuntoConvidados.adicionarConvidados("David", 1236);
    
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
    
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
    
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
      }
}
