package br.senai.poo.lista08;

import java.util.ArrayList;

public class Instrutor extends Pessoa {
    private static int totalInstrutores = 0;

    private String especializacao;
    private String registro;

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Instrutor() {
    }

    public Instrutor(String nome, String CPF, String dataNascimento, String especializacao) {
        super(nome, CPF, dataNascimento);

        this.especializacao = especializacao;
        this.registro = "IN" + ++totalInstrutores;
    }

    public void adicionarAluno(Aluno aluno) {
        System.out.println("Aluno adicionado.\n");
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.printf("========== Alunos de %s ==========\n\n", getNome());
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
    }

    public void exibirInformacoes() {
        System.out.printf("""
                Nome: %s
                CPF: %s
                Data de nascimento: %s
                Especialização: %s
                Registro: %s\n
                """, getNome(), getCPF(), getDataNascimento(), especializacao, registro);
    }

    public static int getTotalInstrutores() {
        return totalInstrutores;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getRegistro() {
        return registro;
    }
}
