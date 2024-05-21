import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) throws Exception {
        int numeroAgencia;
        String nomeAgencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Agencia:");
        numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome da Agencia:");
        nomeAgencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira seu saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Numero da agencia: "+numeroAgencia+" \nAgencia: "+nomeAgencia+"\nCliente: "+nomeCliente+" Saldo: "+saldo);

        System.out.println("Sua conta foi criada com sucesso.");
        scanner.close();
    }
}