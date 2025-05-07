package br.senai.poo.lista07;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TesteTime {
    private Time time;
    private final int JOGADORES_CONTRATADOS = 30;

    @Before
    public void setUp() {
        time = new Time("Bahia", "Treinadeiro");

        for (int i = 1; i <= JOGADORES_CONTRATADOS; i++) {
            time.contratarJogador("" + i, "" + i);
        }
    }

    @Test
    public void testeEscalarQuantidadeMaximaTitular() {
        for (int i = 0; i < time.jogadoresContratados.size(); i++) {
            time.escalarJogador(time.jogadoresContratados.get(i).getNome(), SituacaoEscalacaoEnum.TITULAR);
        }

        assertEquals(SituacaoEscalacaoEnum.TITULAR.getQuantidadeMax(), time.jogadoresEscalados.size());
    }

    @Test
    public void testeEscalarQuantidadeMaximaReserva() {
        for (int i = 0; i < time.jogadoresContratados.size(); i++) {
            time.escalarJogador(time.jogadoresContratados.get(i).getNome(), SituacaoEscalacaoEnum.RESERVA);
        }

        assertEquals(SituacaoEscalacaoEnum.RESERVA.getQuantidadeMax(), time.jogadoresEscalados.size());
    }

    @Test
    public void testeEscalarJogadorNaoContratado() {
        time.escalarJogador("Robertinho", SituacaoEscalacaoEnum.TITULAR);

        boolean jogadorEncontrado = false;
        for (Jogador jogador : time.jogadoresEscalados) {
            if (jogador.getNome().equals("Robertinho")) jogadorEncontrado = true;
        }

        assertFalse(jogadorEncontrado);
    }

    @Test
    public void testeContratarJogador() {
        assertEquals(JOGADORES_CONTRATADOS, time.jogadoresContratados.size());
    }

    @Test
    public void testeRemoverJogador() {
        time.escalarJogador("4", SituacaoEscalacaoEnum.TITULAR);
        time.removerJogadorEscalacao("4");

        boolean jogadorEncontrado = false;
        for (Jogador jogador : time.jogadoresEscalados) {
            if (jogador.getNome().equals("4")) jogadorEncontrado = true;
        }

        assertFalse(jogadorEncontrado);
    }

    @Test
    public void testeEscalarJogadorEscalado() {
        time.escalarJogador("1", SituacaoEscalacaoEnum.TITULAR);
        time.escalarJogador("1", SituacaoEscalacaoEnum.TITULAR);
        time.escalarJogador("1", SituacaoEscalacaoEnum.RESERVA);

        assertEquals(1, time.jogadoresEscalados.size());
    }
}
