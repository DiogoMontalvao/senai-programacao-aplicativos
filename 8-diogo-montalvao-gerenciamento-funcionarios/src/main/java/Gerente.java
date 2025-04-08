public class Gerente extends Funcionario implements Autenticavel {
    private String senha;

    public Gerente() {}
    public Gerente(String nome, double salarioBase, String senha) {
        super(nome, salarioBase);
        setSenha(senha);
    }

    @Override
    public double calcularSalario() {
        double salarioBonus = getSalarioBase() * 1.2;

        return salarioBonus;
    }

    @Override
    public boolean autenticar(String senha) {
        if (!senha.equals(getSenha()))
            return false;

        return true;
    }

    private String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
