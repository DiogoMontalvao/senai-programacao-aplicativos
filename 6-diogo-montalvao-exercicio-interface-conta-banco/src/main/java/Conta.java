public abstract class Conta implements IOperacao {
    private String numero;
    private String agencia;
    private double saldo;

    Conta(){}
    Conta(String numero, String agencia, double saldo) {
        setNumero(numero);
        setAgencia(agencia);
        setSaldo(saldo);
    }

    @Override
    public void obterSaldo() {
        System.out.printf("Saldo da conta: R$ %.2f\n", this.getSaldo());
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0.0) {
            System.out.println("Valor para depósito inválido.");
            return;
        }

        double novoSaldo = this.getSaldo() + valor;
        this.setSaldo(novoSaldo);

        System.out.printf("Depósito de R$ %.2f realizado.\n", valor);
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
