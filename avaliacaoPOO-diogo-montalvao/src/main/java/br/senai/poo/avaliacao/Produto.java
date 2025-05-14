package br.senai.poo.avaliacao;

// Herança de classe (ItemLoja) e interface (Calculavel)
public class Produto extends ItemLoja implements Calculavel {
    // Atributos encapsulados
    private static int ultimoID = 0;

    private CategoriaProdutoEnum categoria;
    private double precoBase;
    private int codigo;

    public Produto(String nome, CategoriaProdutoEnum categoria, double precoBase) {
        super(nome); // Uso do construtor da classe pai
        this.categoria = categoria;
        setPrecoBase(precoBase); // Validação no setter
        this.codigo = ++ultimoID;
    }

    // Sobrescrita interface
    public double calcularPrecoFinal() {
        // Enumeração
        if (categoria.equals(CategoriaProdutoEnum.ELETRONICO)) return precoBase * 1.20;

        if (categoria.equals(CategoriaProdutoEnum.ROUPA)) return precoBase * 1.10;

        if (categoria.equals(CategoriaProdutoEnum.ALIMENTO)) return precoBase * 1.05;

        return precoBase;
    }

    // Sobrescrita classe
    public String exibirInformacoes() {
        return String.format("""
                Nome: %s
                Código: %d
                Categoria: %s
                Preco final: R$ %.2f
                """, getNome(), this.codigo, this.categoria, calcularPrecoFinal());
    }

    // Sobrecarga
    public String exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            return String.format("""
                    Nome: %s
                    Código: %d
                    Categoria: %s
                    Preco final: R$ %.2f
                    """, getNome(), this.codigo, this.categoria, calcularPrecoFinal());
        }

        return getNome() + "\n";
    }

    //Getters e Setters abaixo (Encapsulamento)
    public CategoriaProdutoEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProdutoEnum categoria) {
        this.categoria = categoria;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        // Validação no setter
        if (precoBase < 0) throw new IllegalArgumentException("Preço base inválido.");

        this.precoBase = precoBase;
    }

    public int getCodigo() {
        return codigo;
    }
}
