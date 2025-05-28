import java.util.ArrayList;

public class CadastroEstudantes {
    private ArrayList<Estudante> cadastroEstudantes = new ArrayList<>();

    public void adicionarEstudante(Estudante estudante) {
        cadastroEstudantes.add(estudante);
    }

    public Estudante consultarPorNome(String nome) {
        for (Estudante estudante : cadastroEstudantes) {
            if (nome.equals(estudante.getNome())) return estudante;
        }

        return null;
    }

    public void listarEstudantes() {
        for (Estudante estudante : cadastroEstudantes) {
            System.out.println(estudante.exibirInformacoes());
        }
    }
}
