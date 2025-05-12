package br.senai.poo.lista08;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    static private int totalAlunos = 0;

    private TipoPlano tipoPlano;
    private String matricula;

    private ArrayList<String> aulasAgendadadas = new ArrayList<String>();

    public Aluno() {
        super();
    }

    public Aluno(String nome, String CPF, String dataNascimento, TipoPlano tipoPlano) {
        super(nome, CPF, dataNascimento);

        this.tipoPlano = tipoPlano;
        this.matricula = "AL" + ++totalAlunos;
    }

    public void agendarAula(String nomeAula) {
        System.out.println("Aula agendada.\n");
        aulasAgendadadas.add(nomeAula);
    }

    public void agendarAula(ArrayList<String> aulas) {
        System.out.println("Aulas agendadas.\n");
        aulasAgendadadas.addAll(aulas);
    }

    public void cancelarAula(String nomeAula) {
        System.out.println("Aula cancelada.\n");
        aulasAgendadadas.remove(nomeAula);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("""
                Nome: %s
                CPF: %s
                Data de nascimento: %s
                Plano: %s
                Matrícula: %s
                Aulas agendadas: %s\n
                """, getNome(), getCPF(), getDataNascimento(), tipoPlano, matricula, aulasAgendadadas);
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public TipoPlano getTipoPlano() {
        return this.tipoPlano;
    }

    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
