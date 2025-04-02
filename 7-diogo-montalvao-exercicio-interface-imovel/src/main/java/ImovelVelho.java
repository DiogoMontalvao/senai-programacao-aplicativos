public class ImovelVelho extends Imovel {
    public ImovelVelho() {}
    public ImovelVelho(String endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double calculaValor() {
        return this.getPreco() * 0.85;
    }
}
