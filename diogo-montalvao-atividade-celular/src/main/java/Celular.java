public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private double preco;
    private Capa capa;

    public Celular() {
    }
    public Celular(String marca, String modelo, String cor, double preco, Capa capa) {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setPreco(preco);
        setCapa(capa);
    }

    public String calcularTotal() {
        double total = this.preco + this.capa.getPreco();
        return String.format(
                "Valor total do %s com a capa %s: R$ %s",
                this.modelo, this.capa.getCor(), total);
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Capa getCapa() {
        return this.capa;
    }
    public void setCapa(Capa capa) {
        this.capa = capa;
    }
}
