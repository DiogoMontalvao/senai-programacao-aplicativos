public class Main {

    public static void main(String[] args) {
        Estudante vito = new Estudante("Vito", 47);
        Estudante naara = new Estudante("Naara", 36);
        Estudante fernanda = new Estudante("Fernanda", 36);

        CadastroEstudantes cadastro = new CadastroEstudantes();
        cadastro.adicionarEstudante(vito);
        cadastro.adicionarEstudante(naara);
        cadastro.adicionarEstudante(fernanda);

        cadastro.listarEstudantes();

        System.out.println(cadastro.consultarPorNome("Diogo"));
        System.out.println(cadastro.consultarPorNome("Vito"));
    }
}
