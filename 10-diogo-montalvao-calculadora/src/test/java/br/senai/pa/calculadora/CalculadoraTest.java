package br.senai.pa.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testeSomar() {
        assertEquals(25, calculadora.somar(10, 15));
    }

    @Test
    public void testeSubtrair() {
        assertEquals(5, calculadora.subtrair(15, 10));
    }

    @Test
    public void testeMultiplicar() {
        assertEquals(25, calculadora.multiplicar(5, 5));
    }

    @Test
    public void testeDividir() {
        assertEquals(2.0, calculadora.dividir(20.0, 10.0), 0.0);
    }
}
