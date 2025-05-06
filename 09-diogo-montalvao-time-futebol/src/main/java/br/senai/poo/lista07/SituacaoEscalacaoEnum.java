package br.senai.poo.lista07;

public enum SituacaoEscalacaoEnum {
    TITULAR(11),
    RESERVA(12);

    private final int quantidadeMax;

    private SituacaoEscalacaoEnum(int quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    public int getQuantidadeMax() {
        return this.quantidadeMax;
    }
}
