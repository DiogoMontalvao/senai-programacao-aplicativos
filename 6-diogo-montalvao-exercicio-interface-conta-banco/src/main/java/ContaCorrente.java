public class ContaCorrente extends Conta {
    ContaCorrente() {}
    ContaCorrente(String numero, String agencia, double saldo) {
        super(numero, agencia, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.1;
        double novoSaldo = this.getSaldo() - valor - taxa;

        if (valor <= 0.0 || novoSaldo < 0.0) {
            System.out.printf("Saque de R$ %.2f não realizado, saldo insuficiente.\n", valor);
            return;
        }

        this.setSaldo(novoSaldo);

        System.out.printf("Saque de R$ %.2f realizado.\n", valor);
    }
}
