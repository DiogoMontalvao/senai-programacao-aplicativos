public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {}
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioBonus = getSalarioBase() * 1.1;

        return salarioBonus;
    }
}
