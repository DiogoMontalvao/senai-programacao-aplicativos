public class Estudante {
    private static int QUANTIDADE_ESTUDANTES = 0;

    private String nome;
    private int idade;
    private String matricula;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = "EST" + ++QUANTIDADE_ESTUDANTES;
    }

    public String exibirInformacoes() {
        return String.format("""
                Nome: %s
                Idade: %d anos
                Matrícula: %s
                """, nome, idade, matricula);
    }

    public int getQuantidadeEstudantes() {
        return QUANTIDADE_ESTUDANTES;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
