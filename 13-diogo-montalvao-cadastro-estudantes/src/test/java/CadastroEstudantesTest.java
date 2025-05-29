import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CadastroEstudantesTest {
    CadastroEstudantes estudantes;
    Estudante vito;
    Estudante naara;
    Estudante fernanda;

    @Before
    public void setUp() {
        estudantes = new CadastroEstudantes();

        vito = new Estudante("Vito", 47);
        naara = new Estudante("Naara", 36);
        fernanda = new Estudante("Fernanda", 36);
    }

    @Test
    public void testeAdicionarEstudante() {
        estudantes.adicionarEstudante(vito);
        estudantes.adicionarEstudante(naara);
        estudantes.adicionarEstudante(fernanda);

        Assert.assertEquals(3, estudantes.getQuantidadeCadastroEstudantes());
    }

    @Test
    public void testeConsultarPorNomeCadastrado() {
        estudantes.adicionarEstudante(vito);
        estudantes.adicionarEstudante(naara);
        estudantes.adicionarEstudante(fernanda);

        Assert.assertEquals(vito, estudantes.consultarPorNome("Vito"));
    }

    @Test
    public void testeConsultarPorNomeNull() {
        estudantes.adicionarEstudante(vito);
        estudantes.adicionarEstudante(naara);
        estudantes.adicionarEstudante(fernanda);

        Assert.assertNull(estudantes.consultarPorNome("Karol"));
    }

    @Test
    public void testeListarEstudantes() {
        ArrayList<Estudante> estudantesTest = new ArrayList<>(List.of(vito, naara, fernanda));

        estudantes.adicionarEstudante(vito);
        estudantes.adicionarEstudante(naara);
        estudantes.adicionarEstudante(fernanda);

        Assert.assertEquals(estudantesTest, estudantes.listarEstudantes());
    }
}
