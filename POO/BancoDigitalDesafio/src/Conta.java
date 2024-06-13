import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historicoTransacao;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoTransacao = new ArrayList<>();
    }

    @Override 
    public void addTransicao(String descricao) {
        historicoTransacao.add(descricao);
    }

    @Override 
    public void exibirHistorico(){
        for (String transacao : historicoTransacao) {
            System.out.println(transacao);
        }
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            addTransicao(String.format("Saque de %.2f realizado com sucesso", valor));
        } else {
            addTransicao(String.format("Falha ao tentar sacar %.2f: saldo insuficiente", valor));
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        addTransicao(String.format("Depósito de %.2f realizado com sucesso", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            addTransicao(String.format("Transferência de %.2f realizada com sucesso para conta de %s", valor, contaDestino.getCliente().getNome()));
        } else {
            addTransicao(String.format("Falha ao tentar transferir %.2f: saldo insuficiente", valor));
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
