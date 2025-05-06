package br.senai.pa.calculadora;

public class Calculadora {
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("Não é permitido dividir por zero.");

        return num1 / num2;
    }
}
