package br.senai.poo.lista08;

public class Main {
    public static void main(String[] args) {
        Academia deBairro = new Academia("De Bairro");

        Instrutor naara = new Instrutor("Naara", "12345678910", "01/01/2001", "Murro");
        Instrutor karol = new Instrutor("Karol", "12345678910", "01/01/2001", "Tapa");
        Instrutor westn = new Instrutor("Westn", "12345678910", "01/01/1910", "Coda fofo");

        Aluno vito = new Aluno("Vito", "12345678910", "01/01/2001", TipoPlano.INTERMEDIARIO);
        Aluno fernanda = new Aluno("Fernanda", "12345678910", "01/01/2001", TipoPlano.PREMIUM);
        Aluno diogo = new Aluno("Diogo", "12345678910", "01/01/2001", TipoPlano.BASICO);
        Aluno jao = new Aluno("Jão", "12345678910", "01/01/2001", TipoPlano.BASICO);
        Aluno robertinho = new Aluno("Robertinho", "12345678910", "01/01/2001", TipoPlano.PREMIUM);

        vito.agendarAula("Pilates");
        jao.agendarAula("Judô");
        robertinho.agendarAula("Boxe");

        deBairro.contratarInstrutor(naara);
        deBairro.contratarInstrutor(karol);
        deBairro.contratarInstrutor(westn);

        deBairro.cadastrarAluno(vito);
        deBairro.cadastrarAluno(fernanda);
        deBairro.cadastrarAluno(diogo);
        deBairro.cadastrarAluno(jao);
        deBairro.cadastrarAluno(robertinho);

        deBairro.relatorioAlunos();
        deBairro.relatorioInstrutores();
        deBairro.relatorioAlunosPorPlano();

        System.out.printf("Total de alunos: %s\n", Aluno.getTotalAlunos());
        System.out.printf("Total de instrutores: %s", Instrutor.getTotalInstrutores());
    }
}
