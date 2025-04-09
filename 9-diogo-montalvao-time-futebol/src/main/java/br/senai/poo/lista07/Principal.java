package br.senai.poo.lista07;

public class Principal {
    public static void main(String[] args) {
        Time bahia = new Time("Bahia", "Vitorugo");

        bahia.contratarJogador("Um", "1");
        bahia.contratarJogador("Dois", "2");
        bahia.contratarJogador("Três", "3");
        bahia.contratarJogador("Quatro", "4");
        bahia.contratarJogador("Cinco", "5");
        bahia.contratarJogador("Oito", "8");
        bahia.contratarJogador("Sete", "7");

        bahia.escalarJogador("Três", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Um", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Dois", SituacaoEscalacaoEnum.TITULAR);
        bahia.escalarJogador("Cinco", SituacaoEscalacaoEnum.RESERVA);
        bahia.escalarJogador("Quatro", SituacaoEscalacaoEnum.TITULAR);

        bahia.obterEscalacao();
    }
}
