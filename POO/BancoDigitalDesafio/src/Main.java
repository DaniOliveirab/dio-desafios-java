import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        
        c1.setNome("Nami");
        c2.setNome("Luffy");
        // Criação das contas
        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);
        //Imprimir Extrato
        System.out.println("IMPRIMINDO EXTRATO");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        //Deposito nas contas
        cc.depositar(100000);
        cp.depositar(50);
        System.out.println("IMPRIMINDO EXTRATO DEPOIS DO DEPOSITO");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        //Saque nas contas
        cc.sacar(10);
        cp.sacar(40);
        System.out.println("IMPRIMINDO EXTRATO DEPOIS DO SAQUE");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        //Transferencia nas contas
        cp.transferir(10, cc);
        System.out.println("IMPRIMINDO EXTRATO DEPOIS DA TRANSFERENCIA");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        System.out.println("EXIBINDO HISTORICO COMPLETO DA NAMI");
        cc.exibirHistorico();
        System.out.println("EXIBINDO HISTORICO COMPLETO DO LUFFY");
        cp.exibirHistorico();

        // Criação da lista de contas e adição das contas
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        // Criação do banco com a lista de contas
        Banco banco = new Banco("Meu Banco", contas);

        // Exibir informações
        System.out.println("Informações do Banco:");
        banco.listarClientes();
        System.out.println("");


        
    }
}
