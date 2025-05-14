package br.senai.poo.avaliacao;

// Abstração
abstract public class ItemLoja {
    private String nome; // Atributo encapsulado

    public ItemLoja(String nome) {
        this.nome = nome;
    }

    // Abstração
    abstract public String exibirInformacoes();

    //Getters e Setters abaixo (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
