package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Gabrielle","Danielly","Frederico","Cleiton","Vandelia","Ozivaldo","Bruce","Loro","Jorli","Anahí"};

        selecaoCandidatos(candidatos);

        System.out.println("");
    }
    
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando =true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando =! atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu) {
            System.out.println("Conseguimos contato com candidato " +candidato+ " na tentativa " +tentativasRealizadas);
        }else{
            System.out.println("Nãp conseguimos contato com candidato " +candidato+ " numero de tentativas maximas " +tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(List<String> candidatosSelecionados) {
        System.out.println("IMPRIMIR LISTA DE SELECIONADOS:");

        for (int indice = 0; indice < candidatosSelecionados.size(); indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatosSelecionados.get(indice));
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatosSelecionados) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(String [] candidatos){
        int selecionados = 0;
        int candidatoAtual = 0;
        List<String> candidatosSelecionados = new ArrayList<>();

        while(selecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000;

            System.out.println("O candidato "+candidato+" solicitou este valor de salario "+salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
                candidatosSelecionados.add(candidato);
                selecionados++;
            }
            candidatoAtual++;
        }

        imprimirSelecionados(candidatosSelecionados);

        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
