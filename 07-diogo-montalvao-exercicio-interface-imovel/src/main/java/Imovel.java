public abstract class Imovel implements ICalculoValor {
    private String endereco;
    private double preco;

    Imovel() {}
    Imovel(String endereco, double preco) {
        setEndereco(endereco);
        setPreco(preco);
    }

    @Override
    public void mostraValor() {
        System.out.printf("Valor do imóvel: R$ %.2f\n", calculaValor());
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
