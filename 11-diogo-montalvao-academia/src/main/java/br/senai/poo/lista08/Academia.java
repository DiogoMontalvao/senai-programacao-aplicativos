package br.senai.poo.lista08;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Academia {
    final static private int CAPACIDADE_MAXIMA = 200;

    private String nome;

    private ArrayList<Instrutor> instrutores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Academia() {
    }

    public Academia(String nome) {
        this.nome = nome;
    }

    public void cadastrarAluno(Aluno aluno) {
        if (alunos.size() == CAPACIDADE_MAXIMA) {
            System.out.println("Capacidade máxima atingida.\n");
            return;
        }

        System.out.println("Aluno cadastrado.\n");
        alunos.add(aluno);
    }

    public void contratarInstrutor(Instrutor instrutor) {
        System.out.println("Instrutor contratado.\n");
        instrutores.add(instrutor);
    }

    public Pessoa buscarPessoa(String CPF) {
        for (Aluno aluno : alunos) {
            if (aluno.getCPF().equals(CPF)) return aluno;
        }

        for (Instrutor instrutor : instrutores) {
            if (instrutor.getCPF().equals(CPF)) return instrutor;
        }

        return null;
    }

    public Pessoa buscarPessoaPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) return aluno;
        }

        for (Instrutor instrutor : instrutores) {
            if (instrutor.getNome().equals(nome)) return instrutor;
        }

        return null;
    }

    public void relatorioAlunosPorPlano() {
        System.out.println("========== Plano Básico ==========\n");
        for (Aluno aluno : alunos) {
            if (aluno.getTipoPlano() == TipoPlano.BASICO) aluno.exibirInformacoes();
        }

        System.out.println("========== Plano Intermediário ==========\n");
        for (Aluno aluno : alunos) {
            if (aluno.getTipoPlano() == TipoPlano.INTERMEDIARIO) aluno.exibirInformacoes();
        }

        System.out.println("========== Plano Premium ==========\n");
        for (Aluno aluno : alunos) {
            if (aluno.getTipoPlano() == TipoPlano.PREMIUM) aluno.exibirInformacoes();
        }
    }

    public void relatorioAlunos() {
        System.out.println("========== Alunos ==========\n");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
    }

    public void relatorioInstrutores() {
        System.out.println("========== Instrutores ==========\n");
        for (Instrutor instrutor : instrutores) {
            instrutor.exibirInformacoes();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
