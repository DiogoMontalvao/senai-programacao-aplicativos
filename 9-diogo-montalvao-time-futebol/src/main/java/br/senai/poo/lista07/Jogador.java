package br.senai.poo.lista07;

public class Jogador {
    private String nome;
    private String numeroCamisa;
    private SituacaoEscalacaoEnum situacaoEscalacao;

    public Jogador() {}
    public Jogador(String nome, String numeroCamisa) {
        setNome(nome);
        setNumeroCamisa(numeroCamisa);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public SituacaoEscalacaoEnum getSituacaoEscalacao() {
        return situacaoEscalacao;
    }
    public void setSituacaoEscalacao(SituacaoEscalacaoEnum situacaoEscalacao) {
        this.situacaoEscalacao = situacaoEscalacao;
    }

    @Override
    public String toString() {
        String informacoesFormatadas = String.format(
                """
                Nome jogador: %s
                Número da camisa: %s
                Situação da escalação: %s
                """, this.nome, this.numeroCamisa, this.situacaoEscalacao);

        return informacoesFormatadas;
    }
}
