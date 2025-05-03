public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(float valor) {
        if (valor > 10000) {
            System.out.println("Não é permitido sacar mais de R$ 10.000 por operação.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
        }
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
        } else if (valor > 10000) {
            System.out.println("Não é permitido depositar mais de R$ 10.000 por operação.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + saldo);
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
