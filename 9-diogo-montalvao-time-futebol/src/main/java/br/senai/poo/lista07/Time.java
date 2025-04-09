package br.senai.poo.lista07;

import java.util.ArrayList;

public class Time {
    static int numJogadoresReserva = 0;
    static int numJogadoresTitulares = 0;

    private String nome;
    private String nomeTecnico;

    private ArrayList<Jogador> jogadoresContratados = new ArrayList<>();
    private ArrayList<Jogador> jogadoresEscalados = new ArrayList<>();

    public Time() {}
    public Time(String nome, String nomeTecnico) {
        setNome(nome);
        setNomeTecnico(nomeTecnico);
    }

    public void contratarJogador(String nome, String numeroCamisa) {
        jogadoresContratados.add(new Jogador(nome, numeroCamisa));
    }

    public boolean escalarJogador(String nome, SituacaoEscalacaoEnum situacaoEscalacao) {
        if(limiteAtingido(situacaoEscalacao))
            return false;

        for (Jogador jogador : jogadoresContratados) {
            if (!isJogadorContratado(nome))
                return false;

            if (nome.equalsIgnoreCase(jogador.getNome())) {
                if (jogadorEscalado(jogador))
                    return false;

                jogador.setSituacaoEscalacao(situacaoEscalacao);
                jogadoresEscalados.add(jogador);

                if (situacaoEscalacao == SituacaoEscalacaoEnum.RESERVA)
                    numJogadoresReserva++;

                if (situacaoEscalacao == SituacaoEscalacaoEnum.TITULAR)
                    numJogadoresTitulares++;

                return true;
            }
        }

        return false;
    }

    private boolean limiteAtingido(SituacaoEscalacaoEnum situacaoEscalacao) {
        if (situacaoEscalacao == SituacaoEscalacaoEnum.RESERVA && numJogadoresReserva == 12)
            return true;

        if (situacaoEscalacao == SituacaoEscalacaoEnum.TITULAR && numJogadoresTitulares == 11)
            return true;

        return false;
    }

    private boolean jogadorEscalado(Jogador jogador) {
        return jogador.getSituacaoEscalacao() != null;
    }

    private boolean isJogadorContratado(String nome) {
        for (Jogador jogador : jogadoresContratados) {
            if (nome.equalsIgnoreCase(jogador.getNome()))
                return true;
        }

        return false;
    }

    public void removerJogadorEscalacao(String nome) {
        for (Jogador jogador : jogadoresEscalados) {
            if (nome.equalsIgnoreCase(jogador.getNome())) {
                jogadoresEscalados.remove(jogador);

                if (jogador.getSituacaoEscalacao() == SituacaoEscalacaoEnum.RESERVA)
                    numJogadoresReserva--;

                if (jogador.getSituacaoEscalacao() == SituacaoEscalacaoEnum.TITULAR)
                    numJogadoresTitulares--;

                jogador.setSituacaoEscalacao(null);
                break;
            }
        }
    }

    public void obterEscalacao() {
        for (Jogador jogador : jogadoresEscalados) {
            System.out.println(jogador);
        }
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
