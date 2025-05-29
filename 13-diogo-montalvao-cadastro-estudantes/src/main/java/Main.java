public class Main {

    public static void main(String[] args) {
        Estudante vito = new Estudante("Vito", 47);
        Estudante naara = new Estudante("Naara", 36);
        Estudante fernanda = new Estudante("Fernanda", 36);

        CadastroEstudantes estudantes = new CadastroEstudantes();
        estudantes.adicionarEstudante(vito);
        estudantes.adicionarEstudante(naara);
        estudantes.adicionarEstudante(fernanda);

        for (Estudante estudante : estudantes.listarEstudantes()) {
            System.out.println(estudante.exibirInformacoes());
        }

        System.out.println(estudantes.consultarPorNome("Diogo"));
        System.out.println(estudantes.consultarPorNome("Vito"));
    }
}
