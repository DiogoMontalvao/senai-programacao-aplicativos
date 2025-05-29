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

    public ArrayList<Estudante> listarEstudantes() {
        return cadastroEstudantes;
    }

    public int getQuantidadeCadastroEstudantes() {
        return cadastroEstudantes.size();
    }
}
