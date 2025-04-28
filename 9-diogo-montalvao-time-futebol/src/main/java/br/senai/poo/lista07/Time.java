package br.senai.poo.lista07;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String nomeTecnico;

    private ArrayList<Jogador> jogadoresContratados = new ArrayList<>();
    private ArrayList<Jogador> jogadoresEscalados = new ArrayList<>();

    public Time() {
    }
    public Time(String nome, String nomeTecnico) {
        setNome(nome);
        setNomeTecnico(nomeTecnico);
    }

    public void contratarJogador(String nome, String numeroCamisa) {
        jogadoresContratados.add(new Jogador(nome, numeroCamisa));
    }

    public boolean escalarJogador(String nome, SituacaoEscalacaoEnum situacaoEscalacao) {
        Jogador jogador = encontrarJogador(nome);
        if (jogador == null) return false;

        if (limiteAtingido(situacaoEscalacao)) return false;

        if (jogadorEscalado(jogador)) return false;

        jogador.setSituacaoEscalacao(situacaoEscalacao);
        jogadoresEscalados.add(jogador);

        return true;
    }

    public void removerJogadorEscalacao(String nome) {
        Jogador jogador = encontrarJogador(nome);
        if (jogador == null) return;

        jogadoresEscalados.remove(jogador);
        jogador.setSituacaoEscalacao(null);
    }

    public void obterEscalacao() {
        System.out.println("========== Escalação ==========\n");

        for (Jogador jogador : jogadoresEscalados) {
            System.out.println(jogador);
        }
    }

    private Jogador encontrarJogador(String nome) {
        for (Jogador jogador : jogadoresContratados) {
            if (nome.equalsIgnoreCase(jogador.getNome())) return jogador;
        }

        return null;
    }

    private boolean limiteAtingido(SituacaoEscalacaoEnum situacaoEscalacao) {
        int quantidade = 0;

        for (Jogador jogador : jogadoresEscalados) {
            if (jogador.getSituacaoEscalacao() == situacaoEscalacao) quantidade++;
        }

        return quantidade == situacaoEscalacao.getQuantidadeMax();
    }

    private boolean jogadorEscalado(Jogador jogador) {
        return jogador.getSituacaoEscalacao() != null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }
    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
}
