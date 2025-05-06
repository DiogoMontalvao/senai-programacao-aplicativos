public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario() {}
    public Funcionario(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.printf("""
                Nome funcionário: %s
                Salario base: R$ %.2f
                """, getNome(), calcularSalario());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
