public class ImovelNovo extends Imovel {
    public ImovelNovo() {}
    public ImovelNovo(String endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double calculaValor() {
        return this.getPreco() * 1.3;
    }
}
