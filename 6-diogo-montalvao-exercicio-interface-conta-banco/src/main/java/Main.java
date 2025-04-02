public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("1", "1", 20.0);
        ContaCorrente corrente = new ContaCorrente("2", "1", 30.0);

        poupanca.obterSaldo();
        poupanca.depositar(20.0);
        poupanca.obterSaldo();
        poupanca.sacar(100.0);
        poupanca.sacar(20.0);
        poupanca.obterSaldo();

        System.out.println();

        corrente.obterSaldo();
        corrente.depositar(50.0);
        corrente.obterSaldo();
        corrente.sacar(100.0);
        corrente.sacar(20.0);
        corrente.obterSaldo();
    }
}
