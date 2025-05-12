package br.senai.poo.lista08;

abstract public class Pessoa {
    private String nome;
    private String CPF;
    private String dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF, String dataNascimento) {
        this.nome = nome;
        setCPF(CPF);
        this.dataNascimento = dataNascimento;
    }

    abstract public void exibirInformacoes();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        if (CPF.length() != 11)
            throw new IllegalArgumentException("CPF inválido.");

        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
