import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EstudanteTest {
    Estudante vito;
    @Before
    public void setUp() {
        vito = new Estudante("Vito", 47);
    }

    @Test
    public void testeExibirInformacoes() {
        Assert.assertEquals("""
                Nome: Vito
                Idade: 47 anos
                Matrícula: EST1
                """,
            vito.exibirInformacoes());
    }

}
